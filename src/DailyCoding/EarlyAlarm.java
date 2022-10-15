package DailyCoding;

import java.util.Scanner;

public class EarlyAlarm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if((b-45) < 0)
            System.out.println(String.format("%d %d", (a-1), (60-b)));


    }
}
