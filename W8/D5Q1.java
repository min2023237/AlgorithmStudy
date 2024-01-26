package w8.d5;


import java.util.Scanner;

// 백준 15894번 문제
// 문제를 푼 날짜 : 24.01.26
public class Pyramid {
    public static void main(String[] args) {
        // 가장 아랫부분의 정사각형 개수 n이 주어진다.


        // 정사각형 한 변의 길이를 a라고 했을 때,
        // 맨 위에 있는 변 = a
        // 맨 밑에 있는 변은 = a*n
        // 옆에 있는 변 = a
        // 그런데 이 변이 양쪽에 있으므로 a*2
        // 그리고 옆변은 n개만큼 있으므로
        // a*2*n
        // 각 층의 윗변은 a
        // 각 층의 윗변은 n-1개만큼 있으므로
        // a*(n-1)
        // 둘레는 맨윗변 + 맨밑변 + 옆변 + 각 층 윗변
        // a + (a*n) + (a*2*n) + a*(n-1)
        // a + na + 2na + na -a
        // 4na
        // 그런데 a=1이므로,
        // 결국 4n

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(4*n);
        
    }
}
