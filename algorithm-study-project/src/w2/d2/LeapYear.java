package w2.d2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int year = scanner.nextInt();
        // 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
        if (year < 1 || year > 4000) {
            System.out.println("연도는 1보다 크거나 같고, 4000보다 작아야 합니다.");
        } else if(year % 4 == 0 ) {
            // 1. 무조건 4의 배수일 것
            // 2. 100의 배수가 아닐것
            // 3. 100의 배수지만 400의 배수라면 윤년.
            if(year % 400 == 0 || year % 100 != 0) {
                // 윤년이다.
                System.out.println("1");
            } else {
                // 윤년이 아니다.
                System.out.println("0");
            }
        } else {
            // 윤년이 아니다.
            System.out.println("0");
        }


    }
}
