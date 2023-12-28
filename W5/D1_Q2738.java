package w5.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 백준 2738번 문제
// 23.12.26 화
public class Q2738 {
    public static void main(String[] args) throws IOException {
        // 어떤 입력에 대하여 버퍼링 기능 제공
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // readLine을 통해 한줄 입력 받기
        String input = reader.readLine();

        // 공백을 기준으로 문자열을 나누고 배열로 반환한다.
        String[] splitString = input.split(" ");

        // 배열에서 두 정수를 하나씩 꺼내와서 파싱후 각각 변수에 담아준다.
        int N = Integer.parseInt(splitString[0]);
        int M = Integer.parseInt(splitString[1]);

        //첫번째 행렬 만들기
        int[][] matrixA = new int[N][M];
        for(int i=0; i<N; i++) {
            String[] splitString2 = reader.readLine().split(" ");
            for(int j=0; j<M; j++) {
                matrixA[i][j] = Integer.parseInt(splitString2[j]);
            }
        }

        //두번째 행렬 만들기
        int[][] matrixB = new int[N][M];
        for(int i=0; i<N; i++) {
            String[] splitString3 = reader.readLine().split(" ");
            for(int j=0; j<M; j++) {
                matrixB[i][j] = Integer.parseInt(splitString3[j]);
            }
        }

        // 두 행렬을 더한 값 출력.
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
            }
            System.out.println(); // 각 행의 끝에 개행 문자 추가
        }


    }

}
