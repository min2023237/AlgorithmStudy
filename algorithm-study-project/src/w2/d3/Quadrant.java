package w2.d3;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 줄에는 정수 x가 주어진다.
        // 다음 줄에는 정수 y가 주어진다.
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // (−1000 ≤ x ≤ 1000; x ≠ 0)
        // (−1000 ≤ x ≤ 1000; x ≠ 0)
        if (x == 0 || y == 0 | x < -1000 || x > 1000 || y < -1000 || y > 1000) {
            System.out.println("올바른 정수를 입력하세요.");
        } else if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }


    }
}
