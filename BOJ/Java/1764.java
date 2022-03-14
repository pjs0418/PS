import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) set.add(br.readLine());
        for (int i = 0; i < M; i++) {
            String temp = br.readLine();

            if (set.contains(temp)) result.add(temp);
        }

        Collections.sort(result);

        int resultLen = result.size();
        System.out.println(resultLen);
        for (int i = 0; i < resultLen; i++) System.out.println(result.get(i));

        br.close();
    }
}