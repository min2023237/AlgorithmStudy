package w7.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 백준 5086번 문제
// 문제를 푼 날짜 : 24.01.15

public class MultiplesAndApprox {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> results = new ArrayList<>(); //결과를 담을 배열

        String input;
        while((input = reader.readLine()) != null) {
            String[] splitString = input.split(" ");
            int firstNum = Integer.parseInt(splitString[0]);
            int secondNum = Integer.parseInt(splitString[1]);

            if(firstNum == 0 || secondNum == 0) {
                break;
            }
            // 첫 번째 수가 더 큰지 확인
            // 큰 수를 작은 수로 나눴을 때, 나머지가 0이라면 작은 수는 큰 수의 약수이다.
            else if(firstNum > secondNum) {
                if(firstNum % secondNum == 0) {
                    //첫번째 숫자가 두번째 숫자의 배수이다.
                    results.add("multiple");
                } else {
                    // 첫 번째 수가 두 번째 수의 약수와 배수 모두 아니다.
                    results.add("neither");
                }
            }

            else {
                if(secondNum % firstNum == 0) {
                    //첫 번째 수가 두 번째 수의 약수이다.
                    results.add("factor");
                } else {
                    // 첫 번째 수가 두 번째 수의 약수와 배수 모두 아니다.
                    results.add("neither");
                }
            }

        }

        // 결과 출력
        for (String result : results) {
            System.out.println(result);
        }

    }
}
