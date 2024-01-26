package w8.d3;

import java.util.Scanner;

// 백준 3009번 문제
// 문제를 푼 날짜 : 24.01.24
public class FourthDot {
    public static void main(String[] args) {
        // 세 점의 좌표가 한 줄에 하나씩 주어진다.
        // 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
        Scanner sc = new Scanner(System.in);
        String[] firstDotArr = sc.nextLine().split(" ");
        String[] secondDotArr = sc.nextLine().split(" ");
        String[] thirdDotArr = sc.nextLine().split(" ");

        // 축에 평행한 직사각형을 만들기 위해서 필요한 네번째 점(w,h)을 찾는다.
        // (x1,y1), (x2,y2), (x3,y3) 이렇게 주어졌을때,
        // x1, x2, x3 중 2개는 같은 수이다.
        // 남은 하나의 수는 w와 같다.
        int x = Integer.parseInt(firstDotArr[0]);
        int w = 0;
        if(x != Integer.parseInt(secondDotArr[0])) {
            if(x != Integer.parseInt(thirdDotArr[0])) {
                w = x;
            } else {
                w = Integer.parseInt(secondDotArr[0]);
            }
        } else {
            w = Integer.parseInt(thirdDotArr[0]);
        }

        // y1, y2, y3 중 2개도 같은 수이다.
        // 남은 하나의 수는 h와 같다.
        int y = Integer.parseInt(firstDotArr[1]);
        int h = 0;
        if(y != Integer.parseInt(secondDotArr[1])) {
            if(y != Integer.parseInt(thirdDotArr[1])) {
                h = y;
            } else {
                h = Integer.parseInt(secondDotArr[1]);
            }
        } else {
            h = Integer.parseInt(thirdDotArr[1]);
        }


        // 직사각형의 네 번째 점의 좌표를 출력한다.
        System.out.println(w + " " + h);

    }
}
