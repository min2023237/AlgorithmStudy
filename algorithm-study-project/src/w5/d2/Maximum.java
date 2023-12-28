package w5.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2566번 문제
// 23.12.27 수
public class Maximum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[9][9];

        int max = 0; //최댓값을 저장할 변수

        //최댓값의 위치를 저장할 변수
        int N = 0;
        int M = 0;

        for(int i=0; i<9; i++) {
            String[] splitString = reader.readLine().split(" ");
            for(int j=0; j<9; j++) {
                int num =  Integer.parseInt(splitString[j]);
                if(max < num) {
                    max = num;
                    N = i+1;
                    M = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(N + " " + M);

    }
}
