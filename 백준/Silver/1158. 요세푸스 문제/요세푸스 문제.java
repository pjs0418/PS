import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> result = new LinkedList<>();
        int index = 0;
        boolean[] isDead = new boolean[N];

        int check = 0;
        int count = 0;
        while (index < N) {
            while (count < K) {
                if (check >= N) {
                    check = 0;
                    continue;
                }

                if (!isDead[check]) count++;
                check++;
            }

            index++;
            result.add(check);
            isDead[check - 1] = true;
            count = 0;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < N - 1; i++) {
            sb.append(result.poll());
            sb.append(", ");
        }
        sb.append(result.poll());
        sb.append(">");

        System.out.println(sb);
    }
}