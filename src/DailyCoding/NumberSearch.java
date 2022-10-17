package DailyCoding;
import java.util.*;

public class NumberSearch {
    public static void main(String[] args) {
        // 문자열에서 숫자를 모두 찾아 더한 값을
        // 숫자와 공백을 제외한 나머지 문자열의 길이로 나눈 뒤 결과값을 정수로 반올림하기

        // 조건 1. int 타입을 리턴
        // 조건 2. 빈 문자열을 입력받은 경우, 0으로 리턴
        // 조건 3. 숫자(Digit)는 연속해서 등장하지 않음
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
    public static int numberSearch(String str) {
        if(str.length() == 0) return 0;

        // 숫자가 아닌 값을 없애고 결과값을 문자열에 넣기
        String intStr = str.replaceAll("[^0-9]", "");
        // 숫자와 공백은 없애고 결과값을 문자열에 넣기
        String opStr = str.replaceAll(" ", "").replaceAll("[0-9]", "");

        // int 배열을 생성해서 문자열 담기
        int sum = 0;
        int[] arr = new int[intStr.length()];

        for(int i=0; i<intStr.length(); i++) {
            // 문자를 정수형으로 표현한 값을 sum에 저장
            arr[i] = intStr.charAt(i) - '0';
            sum += arr[i];
        }
        // 나눈 몫은 소수점 한 자리까지 나타내야하기 때문에 double 타입으로 선언하고 Math.round() 를 이용해 반올림 후 int 형 변환
        double result = (double)sum/opStr.length();
        return (int)Math.round((result*10)/10.0);
    }
}
