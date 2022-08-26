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
        int[] arr = new int[100002];
        arr[100001] = 100000;

        for (int i = 0; i < N + 1; i++) arr[i] = N - i; // N보다 작은 점으로 가는 경우(N 포함)
        for (int i = N + 1; i < 100001; i++) {
            if (i % 2 == 0) {
                if (arr[i - 1] < arr[i / 2]) arr[i] = arr[i - 1] + 1;
                else arr[i] = arr[i / 2] + 1;
            } else arr[i] = arr[i - 1] + 1;
        } // N 이후로 한 점 뒤로 가는 경우 제외하고 최소 시간 저장(한 점 앞으로 가는 경우와 2배로 앞으로 가는 경우 비교)
        for (int i = N + 1; i < 100001; i++) {
            int temp = Math.min(arr[i - 1], arr[i + 1]);
            if (i % 2 == 0) {
                int tempMin = Math.min(temp, arr[i / 2]);
                if (arr[i] > tempMin) arr[i] = tempMin + 1;
            } else {
                if (arr[i] > temp) arr[i] = temp + 1;
            }
        } // 가능한 경우의 수 모두 비교

        System.out.println(arr[K]);
    }
}