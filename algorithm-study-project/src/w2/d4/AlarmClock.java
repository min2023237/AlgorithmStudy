package w2.d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AlarmClock {
    public static void main(String[] args) throws IOException {
        // 어떤 입력에 대하여 버퍼링 기능 제공
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // readLine을 통해 한줄 입력 받기
        String input = reader.readLine();

        // 공백을 기준으로 문자열을 나누고 배열로 반환한다.
        String[] splitString = input.split(" ");

        // 배열에서 두 정수를 하나씩 꺼내와서 파싱후 각각 변수에 담아준다.
        int hour = Integer.parseInt(splitString[0]);
        int min = Integer.parseInt(splitString[1]);

        if(hour < 0 || hour > 23 || min < 0 || min > 23) {
            System.out.println("시간을 잘못 입력하셨습니다.");
        }

    }
}
