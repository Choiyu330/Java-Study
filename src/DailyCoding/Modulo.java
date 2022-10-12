package DailyCoding;

public class Modulo {
    public static void main(String[] args) {
        // 주의사항
        // 나눗셈(/), 나머지(%) 연산자 사용금지
        // 0은 어떤 수로 나누어도 나머지는 0
        // 입력값이 0일 때 null 리턴하기

        Integer output = modulo(25, 4);
        System.out.println(output); // --> 1

        output = modulo(25, 0);
        System.out.println(output); // --> null
    }
    static public Integer modulo(int num1, int num2) {

        if (num1 == 0) return 0;
        if (num2 == 0) return null;

        while (num1 >= num2) {
            num1 -= num2;
            if (num1 <= 0) {
                break;
            }
        }
        return num1;
    }
}
