package w5.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 10798번 문제
// 23.12.28 목
public class VerticalReading {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[][] matrixA = new String[5][15];

        for(int i=0; i<5; i++){
            String input = reader.readLine();
            for(int j=0; j<input.length(); j++) {
                matrixA[i][j] = String.valueOf(input.charAt(j));
            }
        }

//        System.out.print(matrixA[0][0]);
//        System.out.print(matrixA[1][0]);


        StringBuilder lineBuilder = new StringBuilder();

        for(int j=0; j<15; j++) {
            for(int i=0; i<5; i++) {
                if(matrixA[i][j] != null) {
                    //System.out.print(matrixA[i][j]);
                    lineBuilder.append(matrixA[i][j]);
                }
            }
        }

        System.out.println(lineBuilder.toString().replaceAll(" ", ""));

    }
}
