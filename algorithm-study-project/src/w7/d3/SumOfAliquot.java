package w7.d3;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

// 백준 9506번 문제
// 문제를 푼 날짜 : 24.01.17
public class SumOfAliquot {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new LinkedHashSet<>();


        // -1을 입력받기 전까지 계속 수를 입력받고,
        // 입력받은 수를 배열에 담는다.
        int N = 0;
        while(N != -1) {
            N = sc.nextInt();
            numbers.add(N);
        }



        // 배열에서 입력받은 수를 꺼낸다.
        for(int num: numbers) {

            if(num == -1) {
                break;
            }

            int sum = 0;
            //Set<Integer> results = new LinkedHashSet<>();
            int[] aliquots = new int[num];
            int count = 0; // 실제로 찾은 약수의 개수

            // 입력받은 수의 약수를 구한다.
            for(int i=1; i<num; i++) {
                if(num % i == 0) {
                    //약수의 합을 구한다.
                    sum += i;
                    aliquots[count++] = i;
                    //results.add(i);
                }
            }

            // 입력받은 수와 약수 비교
            // 약수의 합계와 입력받은 수가 같다면 완전수
            if(num == sum) {
                System.out.print(num+" = ");
                for(int i=0; i<count; i++) {
                    System.out.print(aliquots[i]);
                    if(i<count -1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();

            } else {
                System.out.println(num+" is NOT perfect.");
            }
        }

    }
}
