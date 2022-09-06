public class isPrime {
    public boolean isPrime(int num) {
        // 모든 수는 1로 나누어지기 때문에 FALSE 출력
        // 2부터 num까지 나머지가 0이라면 FALSE 출력
        if (num == 1) return false;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if((num%2) == 0) return false;
        }
        return true;
    }
}
