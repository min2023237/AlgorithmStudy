package w7.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

// 백준 2501번 문제
// 문제를 푼 날짜 : 24.01.16
public class Aliquot {
    public static void main(String[] args) throws IOException {

        // 두 수를 입력받는다.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] splitString = reader.readLine().split(" ");
        int N = Integer.parseInt(splitString[0]);
        int K = Integer.parseInt(splitString[1]);

        //약수를 담을 배열 생성
        //중복된 수를 추가하지 않고, 순서를 보장하기 위해서 LinkedHashSet 사용
        Set<Integer> numbers = new LinkedHashSet<>();

        // N의 약수 구하기
        // N을 1부터 N까지 하나씩 나누어본다.
        // 나누었을 때 0이되면 그 수는 N의 약수이다.
        for(int i=1; i<N+1; i++) {
            if (N % i == 0) {
                numbers.add(i);
            }
        }


        // numbers에 들어있는 요소 중 특정 index 요소 출력
        int index = 1;
        boolean found = false; // 요소를 찾았는지 확하기 위한 플래그
        for (int number : numbers) {
            if(index == K) {
                System.out.println(number);
                found = true;
                break;
            }
            index++;
        }

        if(!found) {
            System.out.println("0");
        }







    }
}
