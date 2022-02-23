import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;

        for (int i = 0; i < N; i++) list.add(Integer.parseInt(st.nextToken()));

        if (N == 1) System.out.println(list.get(0));
        else if (N == 2) System.out.println(Math.max(list.get(0), list.get(1)));
        else {
            for (int i = 1; i < list.size() - 1; i++) {
                int temp = Math.min(list.get(i - 1), list.get(i + 1));
                temp += list.get(i);

                if (max < temp) max = temp;
            }

            if (max < list.get(0)) System.out.println(list.get(0));
            else if (max < list.get(list.size() - 1)) System.out.println(list.get(list.size() - 1));
            else System.out.println(max);
        }
    }
}