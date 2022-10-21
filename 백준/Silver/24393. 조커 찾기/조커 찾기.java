import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> left = new LinkedList<>();
        Queue<Integer> right = new LinkedList<>();
        Queue<Integer> all = new LinkedList<>();
        Queue<Integer> A = new LinkedList<>();

        all.add(1);
        for (int i = 0; i < 26; i++) all.add(0);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 13; j++) left.add(all.poll());
            for (int k = 0; k < 14; k++) right.add(all.poll());

            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) A.add(Integer.parseInt(st.nextToken()));

            int ASize = A.size();
            for (int l = 0; l < ASize; l++) {
                int temp = A.poll();
                if (l % 2 == 0) {
                    for (int m = 0; m < temp; m++) all.add(right.poll());
                } else {
                    for (int m = 0; m < temp; m++) all.add(left.poll());
                }
            }
        }

        for (int i = 1; i <= 27; i++) {
            if (all.poll() == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}