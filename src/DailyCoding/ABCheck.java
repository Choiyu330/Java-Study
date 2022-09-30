package DailyCoding;

import java.util.*;

public class ABCheck {
    public static void main(String[] args) {
        boolean output = ABCheck("lane Borrowed");
        System.out.println(output); // --> true
    }
    public static boolean ABCheck(String str) {
        str = str.toLowerCase();

        for(int i = 4; i < str.length(); i++) {
            if((str.charAt(i) == 'a' && str.charAt(i - 4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i - 4) == 'a')) {
                return true;
            }
        }
        return false;
    }
}