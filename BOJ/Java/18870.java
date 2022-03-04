import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i : sortArr) {
            if (!map.containsKey(i)) map.put(i, idx++);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append(map.get(arr[i])).append(" ");

        System.out.println(sb);

        br.close();
    }
}