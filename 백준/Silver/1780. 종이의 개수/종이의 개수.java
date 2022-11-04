import java.io.*;
import java.util.*;

public class Main {
    static int[] result = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        calc(0, N, paper, N);

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

    static void calc(int start, int end, int[][] paper, int size) {
        int temp = paper[start][end - size];
        int tempSize = size / 3;
        for (int i = start; i < start + size; i++) {
            for (int j = end - size; j < end; j++) {
                if (temp != paper[i][j]) {
                    calc(start, end - size + tempSize, paper, tempSize);
                    calc(start, end - size + tempSize * 2, paper, tempSize);
                    calc(start, end - size + size, paper, tempSize);
                    calc(start + tempSize, end - size + tempSize, paper, tempSize);
                    calc(start + tempSize, end - size + tempSize * 2, paper, tempSize);
                    calc(start + tempSize, end - size + size, paper, tempSize);
                    calc(start + tempSize * 2, end - size + tempSize, paper, tempSize);
                    calc(start + tempSize * 2, end - size + tempSize * 2, paper, tempSize);
                    calc(start + tempSize * 2, end - size + size, paper, tempSize);
                    return;
                }
            }
        }
        result[temp + 1]++;
    }
}