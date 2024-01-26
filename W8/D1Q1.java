package w8.d1;

import java.util.Scanner;

// 백준 27323번 문제
// 문제를 푼 날짜 : 24.01.23
public class Rectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        sc.nextLine();
        int B = sc.nextInt();

        // 직사각형의 넓이 = A*B
        if(A<1 || A >100 || B<1 || B>100) {
            System.out.println("정수 A 또는 B는 1이상 100이하로 입력해주세요.");
        } else {
            System.out.println(A*B);
        }
    }
}
