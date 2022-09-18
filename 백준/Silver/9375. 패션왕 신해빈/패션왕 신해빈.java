import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            HashMap<String, Integer> map = new HashMap<>();
            int result = 1;

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                String trash = st.nextToken();
                String s = st.nextToken();
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

            for (int num : map.values()) result *= (num + 1);

            System.out.println(result - 1);
        }
    }
}