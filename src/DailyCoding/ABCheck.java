package DailyCoding;

import java.util.*;

public class ABCheck {
    public static void main(String[] args) {
        boolean output = ABCheck("HK9J6YjrAcMbq8qKrbS3EaPRT");  // true
        boolean output2 = ABCheck("TgDrnjAz6kAbdEaxFkrKIsa");   // false

        System.out.println(output); // true
        System.out.println(output2); // false
    }
    public static boolean ABCheck(String str) {
        // 대소문자를 구분하지 않기 때문에 전부 소문자로 바꾸기
        str = str.toLowerCase();
        // for문을 이용해 a -> b , b -> a 로 로 끝나는 문자열 찾기
        // 조건식이 참이면 true, 거짓이면 false
        for(int i=4; i<str.length(); i++) {
            if((str.charAt(i) == 'a' && str.charAt(i-4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i-4) == 'a'))
                return true;
        }
        return false;
    }
}