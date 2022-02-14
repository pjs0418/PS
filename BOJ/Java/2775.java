import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][14];

        for(int i = 0;i < 14;i++) arr[0][i] = i + 1;

        for(int i = 1;i < 15;i++) {
            for(int j = 0;j < 14;j++) {
                for(int k = 0;k < j + 1;k++) {
                    arr[i][j] += arr[i - 1][k];
                }
            }
        }

        for(int i = 0;i < T;i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(arr[k][n - 1]);
        }

        br.close();
    }
}