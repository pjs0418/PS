import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                String o = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if (o.contentEquals("I")) map.put(n, map.getOrDefault(n, 0) + 1);
                else if (!map.isEmpty()) {
                    int num = n == 1 ? map.lastKey() : map.firstKey();
                    map.put(num, map.get(num) - 1);
                    if (map.get(num) == 0) map.remove(num);
                }
            }

            if (map.isEmpty()) System.out.println("EMPTY");
            else {
                System.out.print(map.lastKey());
                System.out.print(' ');
                System.out.println(map.firstKey());
            }
        }
    }
}