import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N;
    static char[][] grid;
    static int[][] check;
    static int[][] check2;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static Queue<int[]> queue = new LinkedList<>();
    static Queue<int[]> queue2 = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new char[N][N];
        check = new int[N][N];
        check2 = new int[N][N];
        boolean isChecked = true, isChecked2 = true;
        int count = 0, count2 = 0;

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();

            for (int j = 0; j < N; j++) grid[i][j] = temp.charAt(j);
        }

        while (true) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (check[i][j] == 0) {
                        isChecked = false;
                        queue.add(new int[]{i, j});
                        check[i][j] = 1;
                        break;
                    }
                }

                if (!isChecked) break;
            }

            if (isChecked) break;
            else {
                bfs();
                count++;
                isChecked = true;
            }
        }

        while (true) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (check2[i][j] == 0) {
                        isChecked2 = false;
                        queue2.add(new int[]{i, j});
                        check2[i][j] = 1;
                        break;
                    }
                }

                if (!isChecked2) break;
            }

            if (isChecked2) break;
            else {
                bfs2();
                count2++;
                isChecked2 = true;
            }
        }

        System.out.println(count + " " + count2);

        br.close();
    }

    static void bfs() {
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = temp[0] + dx[i];
                int y = temp[1] + dy[i];

                if (x >= 0 && y >= 0 && x < N && y < N) {
                    if (check[x][y] != 1 && (grid[x][y] == grid[temp[0]][temp[1]])) {
                        queue.add(new int[]{x, y});
                        check[x][y] = 1;
                    }
                }
            }
        }
    }

    static void bfs2() {
        while (!queue2.isEmpty()) {
            int[] temp = queue2.poll();

            for (int i = 0; i < 4; i++) {
                int x = temp[0] + dx[i];
                int y = temp[1] + dy[i];

                if (x >= 0 && y >= 0 && x < N && y < N) {
                    if (check2[x][y] != 1) {
                        if (grid[x][y] == 'B') {
                            if (grid[x][y] == grid[temp[0]][temp[1]]) {
                                queue2.add(new int[]{x, y});
                                check2[x][y] = 1;
                            }
                        } else {
                            if (grid[temp[0]][temp[1]] == 'R' || grid[temp[0]][temp[1]] == 'G') {
                                queue2.add(new int[]{x, y});
                                check2[x][y] = 1;
                            }
                        }
                    }
                }
            }
        }
    }
}