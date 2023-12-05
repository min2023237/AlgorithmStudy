package w2.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            if(scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if(num < 0 || num > 100) {
                    System.out.println("입력할 수 있는 숫자의 범위는 '0 ≤ num ≤ 100' 입니다.");
                    break;
                } else if( 90 <= num ) {
                    System.out.println("A");
                    break;
                } else if( 80 <= num ) {
                    System.out.println("B");
                    break;
                } else if( 70 <= num ) {
                    System.out.println("C");
                    break;
                } else if( 60 <= num ) {
                    System.out.println("C");
                    break;
                } else {
                    System.out.println("F");
                    break;
                }
                //break;

            } else {
                System.out.println("숫자를 입력해주세요.");
                break;
            }

        }





    }
}
