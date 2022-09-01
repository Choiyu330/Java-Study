public class Getlongestword {
    public String getLongestWord(String str) {
        // 문자열을 입력받아 문자열에서 가장 긴 단어 리턴
        // String 타입을 리턴

        // str 길이파악 -> 공백 단위로 나누기 -> 배열 생성해 순서대로 단어넣기 -> for문으로 비교
        String[] arr = str.split(" ");
        String max_str = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max_str.length() < arr[i].length()) {
                max_str = arr[i];
            }
        }
        return max_str;
    }
}
