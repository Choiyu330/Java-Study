package DailyCoding;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(solution(1,13,1));
    }
    public static String solution(String my_string) {

        String answer = "";
        my_string = my_string.toLowerCase();
        String[] str = new String[my_string.length()];

        for(int i=0; i<my_string.length(); i++) {
            str[i] = String.valueOf(my_string.charAt(i));
        }

        Arrays.sort(str);

        answer = Arrays.stream(str).collect(Collectors.joining());
        System.out.println(str);
        System.out.println(Arrays.toString(str));
        System.out.println("" + Arrays.toString(str));
        return answer;
    }
}

