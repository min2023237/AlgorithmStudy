package w5.d4;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 백준 2563번 문제
// 23.12.29 금
public class ColoredPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] splitString = reader.readLine().split(" ");

        //색종이 수
        int blackPaperNum = Integer.parseInt(splitString[0]);

        if ( blackPaperNum > 100) {
            System.out.println("색종이 수는 100이하로 입력하세요.");
        }

        //색종이 수만큼 색종이 위치 입력받기
        for(int i=0; i < blackPaperNum; i++) {
            String[] splitString2 = reader.readLine().split(" ");

            int X = Integer.parseInt(splitString[0]);
            int Y = Integer.parseInt(splitString[1]);



        }






       // 흰색 도화지 배열
        int[][] whitePaper = new int[99][99];



    }

}
