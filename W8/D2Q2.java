package w8.d2;

import java.util.Scanner;

// 백준 1085번 문제
// 문제를 푼 날짜 : 24.01.22
public class EscapeRectangles {
    public static void main(String[] args) {
        //첫째 줄에 x,y,w,h가 주어진다.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int x = Integer.parseInt(inputArr[0]);
        int y = Integer.parseInt(inputArr[1]);
        int w = Integer.parseInt(inputArr[2]);
        int h = Integer.parseInt(inputArr[3]);

        //입력값 x,y,w,h에 대하여 조건을 만족하는 지 확인
        if(x<1 || x>w-1 || y<1 || y>w-1 || w<1 || w>1000 || h<1 || h>1000) {
            System.out.println("올바른 값을 입력해주세요");
        }else {
            // 현재 위치 = (x,y)
            // 왼쪽 아래 꼭지점(0,0)
            // 오른쪽 위 꼭지점(w,h)
            // 직사각형의 경계선까지 가는 거리의 최솟값
            // (0,y)
            int leftDistance = x;
            // (w,y)
            int rightDistance = w - x;
            // (x,0)
            int bottomDistance = y;
            // (x,h)
            int topDistance = h - y;

            int min = leftDistance;
            if(rightDistance < min) min = rightDistance;
            if(bottomDistance < min) min = bottomDistance;
            if(topDistance < min) min = topDistance;

            // 정답을 출력한다.
            System.out.println(min);

        }

    }
}
