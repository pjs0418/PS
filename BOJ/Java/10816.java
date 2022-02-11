import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrN = new int[N];

        for (int i = 0; i < N; i++) arrN[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arrN);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(st.nextToken());

            sb.append((upper_bound(arrN, temp) - lower_bound(arrN, temp)) + " ");
        }

        System.out.println(sb);

        br.close();
    }

    static int lower_bound(int[] arr, int k) {
        int left = 0, right = arr.length, mid;

        while (left < right) {
            mid = (left + right) / 2;

            if (arr[mid] >= k) right = mid;
            else left = mid + 1;
        }

        return left;
    }

    static int upper_bound(int[] arr, int k) {
        int left = 0, right = arr.length, mid;

        while (left < right) {
            mid = (left + right) / 2;

            if (arr[mid] <= k) left = mid + 1;
            else right = mid;
        }

        return left;
    }
}