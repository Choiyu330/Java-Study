package DailyCoding;

class Solution {
    public static void main(String[] args) {
        System.out.println(solution(0, new int[]{1,2,3}));
    }
    public static int solution(int sum, int[] coins) {
        int[] answer = new int[sum + 1];
        // sum 이 0일 때
        answer[0] = 1;
        for (int coin : coins) {
            for (int i=coin; i<=sum; i++) {
                answer[i] += answer[i - coin];
            }
        }
        return answer[sum];
    }
}
