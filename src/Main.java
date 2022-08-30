public class Main {

    public static void main(String[] args) {

        // 수동타입변환
        // int 타입으로 선언된 변수 intValue를 더 작은 단위인 byte로 변환
        int intValue = 128;
        byte byteValue = (byte)intValue;

        // 오버플로우 발생 -> -128 출력
        System.out.println(byteValue);

    }
}

