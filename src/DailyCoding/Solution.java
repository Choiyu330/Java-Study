package DailyCoding;

class Solution {
    public static void main(String[] args) {
        System.out.println(solution("abcdcba"));
    }
    public static int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                String str = s.substring(i, j+1);

                if(isPalin(str)) {
                    if(str.length() > answer)
                        answer = str.length();
                }
            }
        }
        return answer;
    }
    private static Boolean isPalin(String str) {
        int start = 0;
        int end = str.length() - 1;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
