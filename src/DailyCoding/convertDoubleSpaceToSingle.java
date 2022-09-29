package DailyCoding;

public class convertDoubleSpaceToSingle {
    public static void main(String[] args) {
        String output = convertDoubleSpaceToSingle("Hello  World  !!");
        System.out.println(output); // --> "Hello World !!"
    }

    public static String convertDoubleSpaceToSingle(String str) {
        return str.replaceAll("  ", " ");
    }
}
    // 풀이 2
    /*
    public class convertDoubleSpaceToSingle {
        public String convertDoubleSpaceToSingle(String str) {
            String[] words = str.split("  ");
            return String.join(" ", words);
        }
     */
