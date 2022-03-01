import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < K; i++) result += arr[i];

        int temp = result;
        int right = K - 1;
        if (N == K) {
            System.out.println(result);
            return;
        } else {
            for (int i = 1; i < N; i++) {
                right++;
                if (right > N - 1) temp = temp - arr[i - 1] + arr[right - N];
                else temp = temp - arr[i - 1] + arr[right];

                if (result < temp) result = temp;
            }

            System.out.println(result);
        }

        br.close();
    }
}