import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int zeroCnt = 0;

        for (int i = 0; i < N + 1; i += 5) {
            if (i == 0) continue;

            if (i % 125 == 0) zeroCnt += 3;
            else if (i % 25 == 0) zeroCnt += 2;
            else if (i % 5 == 0) zeroCnt++;
        }

        System.out.println(zeroCnt);

        br.close();
    }
}