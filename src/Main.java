public class Main {

    public static void main(String[] args) {

        // 수동타입변환
        // int 타입으로 선언된 변수 intValue를 더 작은 단위인 byte로 변환
        int intValue = 128;
        byte byteValue = (byte)intValue;

        // 오버플로우 발생 -> -128 출력
        System.out.println(byteValue);

        // String 타입의 변수선언과 할당
        // 1. 문자열 리터럴을 String 타입의 변수 name에 할당하는 방법
        String name1 = "Choi Yujin";

        // 2. String 클래스의 인스턴스를 생성하는 방법
        String name2 = new String("Choi Yujin");

        System.out.println("방법 1 : " + name1);
        System.out.println("방법 2 : " + name2);
    }
}

