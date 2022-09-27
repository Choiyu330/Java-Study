package DailyCoding;

public class letterCapitalize {
    public static void main(String[] args) {
        String output2 = letterCapitalize("java  is good ");
        System.out.println(output2); // "Java  Is Good "
    }
    public static String letterCapitalize(String str) {
        // TODO:
        // 새로운 배열을 생성해서 공백으로 구분해서 잘라넣기
        // 배열 첫 번째 인덱스를 대문자로 바꾸기
        // 배열을 다시 문자열로 합치기
        String result = "";
        String words[] = str.split(" ");

        if(str.length() == 0) return result;
        for(int i=0; i<words.length; i++) {
            if(words[i].isEmpty()) {
                words[i] = words[i];
            } else {
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
        }
        result = String.join(" ", words);
        return result;
    }
}
