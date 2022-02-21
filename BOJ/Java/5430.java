import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new ArrayDeque<>();
            boolean isRight = true;
            boolean isError = false;

            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            for (int j = 0; j < n; j++) deque.add(Integer.parseInt(st.nextToken()));

            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == 'R') isRight = !isRight;
                else if (p.charAt(j) == 'D') {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    } else {
                        if (isRight) deque.pollFirst();
                        else deque.pollLast();
                    }
                }
            }

            if (isError) System.out.println("error");
            else {
                StringBuilder sb = new StringBuilder();
                int temp = deque.size();

                sb.append('[');
                if (deque.isEmpty()) sb.append(']');
                else {
                    for (int j = 0; j < temp - 1; j++) {
                        if (isRight) sb.append(deque.pollFirst()).append(',');
                        else sb.append(deque.pollLast()).append(',');
                    }
                    sb.append(deque.poll()).append(']');
                }

                System.out.println(sb);
            }
        }
    }
}