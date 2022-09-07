public class hasRepeatedCharacter {
    public boolean hasRepeatedCharacter(String str) {
        if (str.isEmpty()) return false;

        for(int i=0; i<str.length(); i++) {
            for(int j=0; i<str.length(); i++) {
                if (i == j)
                    continue;
                if (str.charAt(i) == str.charAt(j))
                    return true;
            }
        }
        return false;
    }
}
