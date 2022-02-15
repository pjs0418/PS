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
        int numOfCom = Integer.parseInt(br.readLine());
        int numOfEdge = Integer.parseInt(br.readLine());
        node = new int[numOfCom + 1][numOfCom + 1];
        check = new int[numOfCom + 1];

        for (int i = 0; i < numOfEdge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            node[x][y] = 1;
            node[y][x] = 1;
        }

        bfs();

        br.close();
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        check[1] = 1;
        queue.add(1);

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i < node.length; i++) {
                if (node[temp][i] == 1 && check[i] != 1) {
                    queue.add(i);
                    check[i] = 1;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}