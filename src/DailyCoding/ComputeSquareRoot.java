package DailyCoding;

public class ComputeSquareRoot {
    public static void main(String[] args) {
        // 조건 1. String 타입 리턴
        // 조건 2. 소수점 둘째 자리까지 구한 수를 문자열로 변환해 출력(소수점 셋째자리에서 반올림)
        // 조건 3. Math.sqrt() 함수 사용 금지

        String output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot(6);
        System.out.println(output); // --> "2.45"

        output = computeSquareRoot(144);
        System.out.println(output); // --> "12.00"
    }
    public static String computeSquareRoot(int num) {
        double result = 1, integer = 1;
        int count = 1;

        // 결과값이 정수일 경우
        while (true) {
            if (integer * integer == num) {
                return String.format("%.2f", integer);
            } else if (integer * integer > num) {
                break;
            }
            integer++;

        }
        // 결과값이 실수일 경우
        while (count <= 3) {
            result = (result * result + num) / (result * 2);
            count++;
        }
        return String.format("%.2f", result);
    }
}
