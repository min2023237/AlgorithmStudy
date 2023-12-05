package w1.d1;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 자연수 A와 B 입력받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // A+B, A-B, A*B, A/B, A%B 계산 후 출력
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

    }
}
