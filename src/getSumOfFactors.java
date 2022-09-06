public class getSumOfFactors {
    public int getSumOfFactors(int num) {
        // 1부터 num까지 반복해서 넣어 나머지가 0이면 약수
        // 새로운 변수를 선언해 결과값 넣기
        int result = 0;

        for(int i=1; i<=num; i++) {
            if ((num%i) == 0) {
                result += i;
            }
        }
        return result;
    }
}
