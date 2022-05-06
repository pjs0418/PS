import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int order = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        visit(N, r, c);

        System.out.println(order);

        br.close();
    }

    private static void visit(int N, int r, int c) {
        int temp = (int) Math.pow(2, N - 1);

        if (N == 0) return;

        if (r < temp && c < temp) {
            visit(N - 1, r, c);
        } else if (r < temp) {
            order += temp * temp;
            visit(N - 1, r, c - temp);
        } else if (c < temp) {
            order += temp * temp * 2;
            visit(N - 1, r - temp, c);
        } else {
            order += temp * temp * 3;
            visit(N - 1, r - temp, c - temp);
        }
    }
}