import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            if (B == N && B == 0) break;

            int A = 1;
            int min = Integer.MAX_VALUE;
            while (true) {
                int temp = Math.abs((int) Math.pow(A, N) - B);
                if (min > temp) {
                    min = temp;
                    A++;
                } else break;
            }

            System.out.println(A - 1);
        }
    }
}