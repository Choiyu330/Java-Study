public class computePower {
    public int computePower(int base, int exponent) {
        // 지수에 입력한 숫자만큼
        // 밑을 곱한 뒤 결과값에 넣기
        int result = 1;

        for(int i=0; i<exponent; i++) {
            result *= base;
        }

        return result;
    }
}
