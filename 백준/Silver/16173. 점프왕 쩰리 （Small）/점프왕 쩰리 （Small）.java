import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        map = new int[N + 1][N + 1];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j < N + 1; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        bfs(map, N);
    }

    static void bfs(int[][] map, int N) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] check = new boolean[N + 1][N + 1];

        queue.add(new int[]{1, 1});
        check[1][1] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            if (temp[0] == N && temp[1] == N) {
                System.out.println("HaruHaru");
                return;
            } else if (temp[0] > N || temp[1] > N) continue;

            int value = map[temp[0]][temp[1]];
            if (temp[0] + value <= N && !check[temp[0] + value][temp[1]]) {
                queue.add(new int[]{temp[0] + value, temp[1]});
                check[temp[0] + value][temp[1]] = true;
            }
            if (temp[1] + value <= N && !check[temp[0]][temp[1] + value]) {
                queue.add(new int[]{temp[0], temp[1] + value});
                check[temp[0]][temp[1] + value] = true;
            }
        }

        System.out.println("Hing");
    }
}