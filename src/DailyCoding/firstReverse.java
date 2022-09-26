package DailyCoding;

public class firstReverse {
    public static void main(String[] args) {
        String output = Reverse("!dlroW olleH");
        System.out.println(output); // "Hello World!"

    }
    static public String Reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();

        return reversedStr;
    }
}
