import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) > Math.abs(o2)) return Math.abs(o1) - Math.abs(o2);
            else if (Math.abs(o1) == Math.abs(o2)) return o1 - o2;
            else return -1;
        });

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());

            if (x != 0) queue.add(x);
            else {
                if (queue.isEmpty()) System.out.println(0);
                else System.out.println(queue.poll());
            }
        }
    }
}