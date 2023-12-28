package w3.d2;

import java.util.Scanner;

// 10871번 문제
public class LessThanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        if(n <=1 || x <=1 || n >= 10000 || x >= 10000) {
            System.out.println("정수의 범위를 확인하세요.");
        } else {
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                if (number < x) {
                    System.out.print(number + " ");
                }
            }
        }

    }
}
