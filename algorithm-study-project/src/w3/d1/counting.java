package w3.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 10807번 문제
public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numbers = new int[N];
        for(int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        if (v <= -100 || v >=100) {
            System.out.println("정확한 개수를 입력하세요.");
        } else {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (numbers[i] == v) {
                    count++;
                }
            }

            System.out.println(count);
        }



    }


}
