import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String[] name = new String[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken();
        }

        int check = 0;
        for (int i = 0; i < N - 1; i++) {
            if (name[i].compareTo(name[i + 1]) > 0) check -= 1;
            else check += 1;
        }

        if (check < 0) {
            if (N == -check + 1) System.out.println("DECREASING");
            else System.out.println("NEITHER");
        } else {
            if ((N - 1) == check) System.out.println("INCREASING");
            else System.out.println("NEITHER");
        }
    }
}