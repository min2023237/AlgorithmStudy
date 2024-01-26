package w8.d5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// 백준 9063번 문제
// 문제를 푼 날짜 : 24.01.26
public class Land {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫째 줄 : 점의 개수 N이 주어진다.
        int N = sc.nextInt();
        int[] arrayX = new int[N];
        int[] arrayY = new int[N];
        sc.nextLine();

        // 이어지는 N줄에는 각 점의 좌표가 두 개의 정수로 한 줄에 하나씩 주어진다.

        for(int i=0; i<N; i++) {
            arrayX[i] = sc.nextInt();
            arrayY[i] = sc.nextInt();
            sc.nextLine();
        }


        // 옥구슬이 나오는 모든 지점을 포함하는
        // 가장 작은 남북, 동서 방향으로 평행한 변을 갖는 직사각형의 대지

        // x축의 가장 작은 숫자 = minX
        // x축의 가장 큰 숫자 = maxX
        // y축의 가장 작은 숫자 = minY
        // y축의 가장 큰 숫자 = maxY
        Arrays.sort(arrayX);
        int minX = arrayX[0];
        int maxX = arrayX[arrayX.length - 1];

        Arrays.sort(arrayY);
        int minY = arrayY[0];
        int maxY = arrayY[arrayY.length - 1];


        // maxX - minX = 밑변의 길이 = x
        // maxY - minY = 측변의 길이 = y

        int x = maxX - minX;
        int y = maxY - minY;

        // 직사각형 넓이 = 밑변 * 측변
        // 넓이 출력
        System.out.println(x * y);

        sc.close();
    }
}
