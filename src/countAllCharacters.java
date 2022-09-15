import java.util.HashMap;

public class countAllCharacters {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        if(str.length() == 0) return null;
            char[] chs = str.toCharArray();
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(Character str2 : chs) {
                hashMap.put(str2, 0);
            }
            for(int i=0; i<str.length(); i++) {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
            }
            return hashMap;
    }
}
