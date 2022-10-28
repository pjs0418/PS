import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            if (N == 0) {
                System.out.printf("Case #%d: INSOMNIA\n", i + 1);
            } else {
                int sleep = 0;
                int count = 1;

                while (sleep != 1023) {
                    int temp = count * N;
                    String s = Integer.toString(temp);

                    for (int j = 0; j < s.length(); j++) {
                        char c = s.charAt(j);
                        sleep |= 1 << c - 48;
                    }

                    count++;
                }

                System.out.printf("Case #%d: %d\n", i + 1, (count - 1) * N);
            }
        }
    }
}