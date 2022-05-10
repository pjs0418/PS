import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] article = new int[5];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) article[i] = Integer.parseInt(st.nextToken());

        int people = L * P;
        for (int i = 0; i < 5; i++) System.out.print(article[i] - people + " ");

        br.close();
    }
}