class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int length = triangle.length;
        int[][] dp = new int[length][length];
        
        dp[0][0] = triangle[0][0];
        
        for(int i = 1;i < length;i++) {
            for(int j = 0;j <= i;j++) {
                if(j == 0) {
                    dp[i][0] = dp[i - 1][0] + triangle[i][0];
                } else if(j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
            }
        }
        
        for(int i = 0;i < length;i++) {
            if(answer < dp[length - 1][i]) {
                answer = dp[length - 1][i];
            }
        }
        
        return answer;
    }
}