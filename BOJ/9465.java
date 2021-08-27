import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numOfTestCase = input.nextInt();
        int[][] board = new int[2][100001];
        int[][] dp = new int [2][100001];

        dp[0][0] = dp[1][0] = 0;

        for(int i = 0;i < numOfTestCase;i++) {

            int n = input.nextInt();

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < n; k++) {
                    board[j][k] = input.nextInt();
                }
            }

            dp[0][1] = board[0][0];
            dp[1][1] = board[1][0];

            for(int j = 2;j < (n + 1);j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + board[0][j - 1];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + board[1][j - 1];
            }

            if(dp[0][n] >= dp[1][n]) {
                System.out.println(dp[0][n]);
            }
            else {
                System.out.println(dp[1][n]);
            }
        }
    }
}