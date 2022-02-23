import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        Arrays.fill(dp, 4);

        for (int i = 1; i < n + 1; i++) {
            int temp = (int) Math.sqrt(i);

            if (i - (temp * temp) == 0) dp[i] = 1;
            else {
                for (int j = 1; j <= temp; j++) {
                    int squared = j * j;
                    int countTemp = dp[squared] + dp[i - squared];

                    if (dp[i] > countTemp) dp[i] = countTemp;
                }
            }
        }

        System.out.println(dp[n]);
    }
}