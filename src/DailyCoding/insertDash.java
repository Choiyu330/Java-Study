package DailyCoding;
import java.util.*;

public class insertDash {
//  오류 발생
// 	public String insertDash(String str) {

// 		StringBuffer sb = new StringBuffer(str);
// 		String reuslt = "";
// 		if(str.length() == 0) return null;
//     // 다음값이 홀수라면 뒤에 '-' 추가
// 		for(int i=1; i<str.length(); i++) {
// 			if(str.charAt(i)%2 == 0 && str.charAt(i-1)%2 == 0) {
// 				sb.insert(i+1, '-');
// 			}
// 		}
// 		return sb.toString();
// 	}

    public class Solution {
        public String insertDash(String str) {
            if(str.length() == 0) {
                return null;
            }
            String result = "" + str.charAt(0);

            for(int i = 1; i < str.length(); i++) {
                int preNumber = Character.getNumericValue(str.charAt(i - 1)) % 2;
                int curNumber = Character.getNumericValue(str.charAt(i)) % 2;
                if(preNumber != 0 && curNumber != 0) {
                    result = result + "-";
                }
                result = result + str.charAt(i);
            }
            return result;
        }
    }

}
