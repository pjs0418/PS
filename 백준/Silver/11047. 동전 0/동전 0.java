import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        int check = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            coin[i] = Integer.parseInt(st.nextToken());

            if (coin[i] <= K) check = i;
        }

        for (int i = check; i >= 0; i--) {
            if (K == 0) break;
            else if (K < coin[i]) continue;

            while (K >= coin[i]) {
                result++;
                K -= coin[i];
            }
        }

        System.out.println(result);
    }
}