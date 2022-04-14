import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[2][41];
        arr[0][0] = 1;
        arr[1][0] = 0;
        arr[0][1] = 0;
        arr[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            arr[0][i] = arr[0][i - 1] + arr[0][i - 2];
            arr[1][i] = arr[1][i - 1] + arr[1][i - 2];
        }

        for (int i = 0; i < T; i++) {
            int temp = Integer.parseInt(br.readLine());
            System.out.print(arr[0][temp] + " " + arr[1][temp] + "\n");
        }

        br.close();
    }
}