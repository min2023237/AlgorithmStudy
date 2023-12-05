package w2.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1330번
// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
public class CompareTwoNum {
    public static void main(String[] args) throws IOException {
        // 어떤 입력에 대하여 버퍼링 기능 제공
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // readLine을 통해 한줄 입력 받기
        String input = reader.readLine();

        // 공백을 기준으로 문자열을 나누고 배열로 반환한다.
        String[] splitString = input.split(" ");

        // 배열에서 두 정수를 하나씩 꺼내와서 파싱후 각각 변수에 담아준다.
        int A = Integer.parseInt(splitString[0]);
        int B = Integer.parseInt(splitString[1]);



        while(true) {
            // 제한 -10,000 ≤ A, B ≤ 10,000
            if(A <= -10000 || A >= 10000 || B <= -10000 || B >= 10000) {
                System.out.println("입력할 수 있는 숫자의 범위는 '-10,000 ≤ A, B ≤ 10,000' 입니다.");
                break;
            } else if (A > B) {         //A가 B보다 큰 경우에는 '>'를 출력한다.
                System.out.println(">");
                break;
            } else if (A < B) {         // A가 B보다 작은 경우에는 '<'를 출력한다.
                System.out.println("<");
                break;
            } else if (A == B) {        // A와 B가 같은 경우에는 '=='를 출력한다.
                System.out.println("==");
                break;
            } else {
                break;
            }
        }


    }
}
