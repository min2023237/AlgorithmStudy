package w6.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2745번 문제
// 문제를 푼 날짜 : 24.01.03 - 24.01.05
// 10진법 : 0~9까지 10개의 숫자를 사용.
// 36진법 : 0부터 9까지의 숫자와 A부터 Z까지의 알파벳(총 26개의 알파벳)을 사용
// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
// 35진법은 Y까지 사용한다.
public class BaseConversion {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] splitString = reader.readLine().split(" ");

        //B진법 수 N
        String N = splitString[0];
        char[] chars = N.toCharArray();

        //B진법
        int B = Integer.parseInt(splitString[1]);


        //chars의 길이
        int cL = chars.length - 1;

        //
        int result = 0;
        int square = 1;

        for (int i = cL; i >= 0; i--) {
            int c;
            if (Character.isDigit(chars[i])) {
                c = chars[i] - '0';
            } else {
                c = chars[i] - 'A' + 10;
            }

//            for (int i = 0; i < chars.length; i++) {
//                int c = chars[i] - '0';
//
//                for (int j=0; j<cL; j++) {
//
//                    square = square * B;
//                    //System.out.println("square:" + square);
//
//                }

            result += c * square;
            square *= B;
            //System.out.println("result:" + result);
            //cL --;
            //System.out.println("CL:" + cL);

        }

        System.out.println(result);

    }

}