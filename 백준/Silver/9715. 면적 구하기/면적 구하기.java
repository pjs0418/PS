import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int total = 0;
            int minus = 0;
            int[][] blocks = new int[R][C];

            for (int j = 0; j < R; j++) {
                st = new StringTokenizer(br.readLine());
                String row = st.nextToken();

                for (int k = 0; k < C; k++) {
                    int block = row.charAt(k) - 48;
                    blocks[j][k] = block;
                    total += 6 * block;

                    if (block > 0) minus += 2 * (block - 1);

                    if (k > 0) {
                        minus += 2 * Math.min(blocks[j][k - 1], blocks[j][k]);
                    }

                    if (j > 0) {
                        minus += 2 * Math.min(blocks[j - 1][k], blocks[j][k]);
                    }
                }
            }

            System.out.println(total - minus);
        }
    }
}