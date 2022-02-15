import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] node;
    static int[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfNode = Integer.parseInt(st.nextToken());
        int numOfEdge = Integer.parseInt(st.nextToken());
        node = new int[numOfNode + 1][numOfNode + 1];
        check = new int[numOfNode + 1];

        for (int i = 0; i < numOfEdge; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            node[x][y] = 1;
            node[y][x] = 1;
        }

        bfs(numOfNode);

        br.close();
    }

    static void bfs(int numOfNode) {
        List<String> list = new ArrayList<>();
        int count = 0;

        for (int i = 1; i < numOfNode + 1; i++) list.add(Integer.toString(i));

        while (list.size() != 0) {
            Queue<Integer> queue = new LinkedList<>();

            String temp = list.get(0);
            list.remove(0);
            queue.add(Integer.parseInt(temp));
            check[Integer.parseInt(temp)] = 1;

            while (!queue.isEmpty()) {
                int tempNum = queue.poll();

                for (int j = 1; j < node.length; j++) {
                    if (node[tempNum][j] == 1 && check[j] != 1) {
                        check[j] = 1;
                        queue.add(j);
                        list.remove(Integer.toString(j));
                    }
                }
            }

            count++;
        }

        System.out.println(count);
    }
}