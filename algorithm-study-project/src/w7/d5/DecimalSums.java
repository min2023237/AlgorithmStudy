package w7.d5;

import java.util.Scanner;

// 백준 2581번 문제
// 문제를 푼 날짜 : 24.01.19
public class DecimalSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 자연수 M이 주어진다.
        int M = sc.nextInt();
        sc.nextLine();

        // 자연수 N이 주어진다.
        int N = sc.nextInt();

        // 소수의 합
        int sum = 0;

        // 최소값
        int min = N;


        // M이 N이하의 자연수 중 소수인 것을 찾는다.
        for(int i=M; i<=N; i++) {
            double sqrtResult = Math.sqrt(i);
            double absoluteValue = Math.abs(sqrtResult);

            //소수 여부
            boolean isDecimal = true;



            //소수 판별
            for(int j=2; j<=absoluteValue; j++) {
                if(i % j == 0) {
                    isDecimal = false;
                    break;
                }
            }

            // 소수의 합과 최소값 계산
            if(isDecimal) {
                sum += i;
                if(i < min) {
                    min = i;
                }
            }

        }

        if(sum == 0) {
            System.out.println("-1");
        } else {

            // 소수들의 합을 출력한다.
            System.out.println(sum);

            // 소수들의 최솟값을 출력한다.
            System.out.println(min);

        }
    }
}
