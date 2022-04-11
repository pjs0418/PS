import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> P = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) P.add(Integer.parseInt(st.nextToken()));

        Collections.sort(P);

        int result = 0;
        int cumulative = 0;

        for (int i = 0; i < N; i++) {
            cumulative += P.get(i);
            result += cumulative;
        }

        System.out.println(result);
    }
}