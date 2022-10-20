import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) result++;
            }
        }

        System.out.println(result);
    }
}