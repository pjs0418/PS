import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N, H;
    static int[][][] node;
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {0, 0, 0, 0, -1, 1};
    static int[] dz = {-1, 1, 0, 0, 0, 0};
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        node = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    node[i][j][k] = Integer.parseInt(st.nextToken());

                    if (node[i][j][k] == 1) queue.add(new int[]{i, j, k});
                }
            }
        }

        bfs();

        br.close();
    }

    static void bfs() {
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i = 0; i < 6; i++) {
                int z = temp[0] + dz[i];
                int y = temp[1] + dy[i];
                int x = temp[2] + dx[i];

                if (x >= 0 && y >= 0 && z >= 0 && x < M && y < N && z < H) {
                    if (node[z][y][x] == 0) {
                        queue.add(new int[]{z, y, x});
                        node[z][y][x] = node[temp[0]][temp[1]][temp[2]] + 1;
                    }
                }
            }
        }

        int result = -2;
        boolean isZero = false;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (node[i][j][k] == 0) isZero = true;

                    result = Math.max(result, node[i][j][k]);
                }
            }
        }

        if (isZero) System.out.println(-1);
        else System.out.println(result - 1);
    }
}