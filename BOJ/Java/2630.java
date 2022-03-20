import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] paper;
    static int[] result = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N + 1][N + 1];
        int flag = -1;
        int checkCnt = 1;

        for (int i = 1; i < N + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j < N + 1; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());

                if (i == 1 && j == 1) flag = paper[i][j];
                else {
                    if (flag == paper[i][j]) checkCnt++;
                }
            }
        }

        if (checkCnt == N * N) {
            if (flag == 0) {
                System.out.println(1);
                System.out.println(0);
            } else {
                System.out.println(0);
                System.out.println(1);
            }
        } else {
            solve(1, 1, N / 2);
            solve(1, N / 2 + 1, N / 2);
            solve(N / 2 + 1, 1, N / 2);
            solve(N / 2 + 1, N / 2 + 1, N / 2);

            System.out.println(result[0]);
            System.out.println(result[1]);
        }

        br.close();
    }

    static void solve(int x, int y, int N) {
        if (N == 1) {
            result[paper[x][y]]++;
            return;
        }

        int flag = paper[x][y];
        int checkCnt = 0;

        for (int i = x; i < N + x; i++) {
            for (int j = y; j < N + y; j++) {
                if (flag == paper[i][j]) checkCnt++;
            }
        }

        if (checkCnt == N * N) result[flag]++;
        else {
            solve(x, y, N / 2);
            solve(x, y + N / 2, N / 2);
            solve(x + N / 2, y, N / 2);
            solve(x + N / 2, y + N / 2, N / 2);
        }
    }
}