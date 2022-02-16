import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] cabbage;
    static int[][] check;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int count = 0;

            cabbage = new int[N][M];
            check = new int[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                cabbage[Y][X] = 1;
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (check[j][k] != 1 && cabbage[j][k] == 1) {
                        bfs(j, k);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        br.close();
    }

    static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{y, x});
        check[y][x] = 1;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i = 0; i < 4; i++) {
                int tempY = temp[0] + dy[i];
                int tempX = temp[1] + dx[i];

                if (tempY >= 0 && tempX >= 0 && tempY < N && tempX < M) {
                    if (check[tempY][tempX] != 1 && cabbage[tempY][tempX] == 1) {
                        queue.add(new int[]{tempY, tempX});
                        check[tempY][tempX] = 1;
                    }
                }
            }
        }
    }
}