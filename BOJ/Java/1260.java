import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] node;
    static int[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        node = new int[N + 1][N + 1];
        check = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            node[x][y] = 1;
            node[y][x] = 1;
        }

        dfs(K);
        check = new int[N + 1];
        System.out.print("\n");
        bfs(K);

        br.close();
    }

    static void dfs(int startNode) {
        check[startNode] = 1;
        System.out.print(startNode + " ");

        for (int i = 1; i < node.length; i++) {
            if (node[startNode][i] == 1 && check[i] != 1) dfs(i);
        }
    }

    static void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        queue.add(startNode);
        check[startNode] = 1;
        sb.append(startNode).append(" ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i < node.length; i++) {
                if (node[temp][i] == 1 && check[i] != 1) {
                    check[i] = 1;
                    queue.add(i);
                    sb.append(i).append(" ");
                }
            }
        }

        System.out.println(sb);
    }
}