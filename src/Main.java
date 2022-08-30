import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) {

        // 수동타입변환
        // int 타입으로 선언된 변수 intValue를 더 작은 단위인 byte로 변환
        int intValue = 128;
        byte byteValue = (byte)intValue;

        // 오버플로우 발생 -> -128 출력
        System.out.println(byteValue);
        System.out.println();

        // String 타입의 변수선언과 할당
        // 1. 문자열 리터럴을 String 타입의 변수 name에 할당하는 방법
        String name1 = "Choi Yujin";

        // 2. String 클래스의 인스턴스를 생성하는 방법
        String name2 = new String("Choi Yujin");

        System.out.println("방법 1 : " + name1);
        System.out.println("방법 2 : " + name2);
        System.out.println();

        // StringTokenizer 클래스
        // 문자열을 사용자가 지정한 구분자로 문자열을 쪼개주는 클래스
        String str = "This is a string example using StringTokenizer";
        StringTokenizer tokenizer = new StringTokenizer(str);
        System.out.println(str);

        // countTokens
        // 남아있는 token의 개수를 반환(현재 남아있는 token의 수)
        System.out.println("total tokens : " + tokenizer.countTokens());
        System.out.println();

        // hasMoreTokens
        // 현재 위치 뒤에 있는 문자열에서 하나 이상의 토큰을 사용할 수 있는 경우
        // true 반환, 그렇지 않으면 false 반환
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println("total tokens : " + tokenizer.countTokens());
    }
}

