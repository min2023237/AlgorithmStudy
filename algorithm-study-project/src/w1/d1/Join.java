package w1.d1;

import java.util.Scanner;

public class Join {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("아이디를 입력하세요. ");
            String scanId = scanner.nextLine();
            int idLength = scanId.length();

            if(idLength > 50) {
                System.out.println("아이디는 50자를 넘을 수 없습니다.");
                continue;
            }

            boolean b = true;
            for(int i=0; i<idLength; i++) {
                char a = scanId.charAt(i);
                int asc = (int) a;

                if(asc<97 || asc>122) {
                    System.out.println("영소문자만 입력가능합니다.");
                    b = false;
                    break;
                }

            }

            if(b) {
                System.out.println(scanId + "??!");
                break;
            }

        }

    }
}
