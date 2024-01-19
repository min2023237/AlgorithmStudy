package w7.d4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// 백준 1978번 문제
// 문제를 푼 날짜 : 24.01.18
public class Decimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //수의 개수 N을 입력받는다.
        int N = sc.nextInt();
        sc.nextLine();

        //N개의 수를 입력받고,
        //공백을 기준으로 문자열을 분리하여 배열에 저장
        String numsLine = sc.nextLine();
        String[] numsStr = numsLine.split(" ");

        //소수의 개수
        int decimalCounts = 0;

        for (int i = 0; i < N-1; i++) {
            int num = Integer.parseInt(numsStr[i]);

            // 주어진 수들 중 소수를 찾는다.
            // 정수 N이 있을 때 2부터 N-1까지의 자연수로 나누어서 나누어 떨어지지 않는 수인지 확인해보면,
            // N이 소수라는 것을 판정할 수 있다.
            // 사실 2부터 N-1까지 모두 확인할 필요가 없고,
            // [√N]까지만 나누어보면 소수인지 판정할 수 있다.
            // 예를 들어, 77의 경우 √77=8.77...이므로, 2부터 8까지로만 나누어보면된다.
            // 이 과정에서 77은 7로 나누어지므로 소수가 아닌 합성수이다.
            // 53의 경우 √53=7.28이므로, 2부터 7까지만 나누어보면 되는데,
            // 이 과정에서 2부터 7까지 어떠한 수로도 나누어지지 않으므로 53은 소수이다.
            double sqrtResult = Math.sqrt(num);  //Math.sqrt는 주어진 숫자의 제곱근을 반환한다.(√)
            double absoluteValue = Math.abs(sqrtResult);    //Math.abs는 주어진 숫자의 절대값을 반환한다.

            // 소수 여부
            boolean isDemical = true;

            // 소수 판별
            // 2부터 absoluteValue까지
            for(int j=2; j<=absoluteValue; j++) {
                if(num % j == 0) {
                    isDemical = false;
                    break;
                }
            }

            // 소수의 개수 출력
            if(isDemical) {
                decimalCounts++;
            }

        }


        //소수의 개수를 출력한다.
        System.out.println(decimalCounts);

    }
}
