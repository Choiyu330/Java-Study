import java.util.*;

    public class addOddValues {
        public int addOddValues(HashMap<Character, Integer> hashMap) {
            //TODO..
            Set<Character> keyList = hashMap.keySet();
            int sum = 0;
            for(Character ch : keyList) {
                if((hashMap.get(ch)%2) == 0) {
                    sum += ch;
                }
            }
            return sum;
        }
    }
