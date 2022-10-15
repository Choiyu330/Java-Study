package DailyCoding;

import java.util.Scanner;

public class EarlyAlarm {
    public static void main(String[] args) {

        // 60-|45-현재시간(분)|
        // 45분 이전이면 항상 음수가 나오기 때문에
        // 결과적으로 15+현재시간(분)으로 계산하면 된다

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 0시 이고 45분 이전일 경우
        if(a == 0 && (b-45) < 0) System.out.println(String.format("23 %d", b+15));
        // 45분 이전일 경우
        else if((b-45) < 0) System.out.println(String.format("%d %d", a-1, b+15));
        // 나머지 경우
        else System.out.println(String.format("%d %d", a, b-45));
    }
}
