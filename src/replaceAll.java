public class replaceAll {
    public String replaceAll(String str, char from, char to) {
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == from) {
                StringBuilder sb = new StringBuilder(str);

                sb.setCharAt(i, to);
                str = sb.toString();
            }
        }
        return str;
    }
}
