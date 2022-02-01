import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < num; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1;i < 10001;i++) {
            for(int j = 0;j < arr[i];j++) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}
