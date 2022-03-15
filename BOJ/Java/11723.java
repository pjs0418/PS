import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int result = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String function = st.nextToken();

            switch (function) {
                case "add":
                    int num = Integer.parseInt(st.nextToken());
                    result |= 1 << num;
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    result &= ~(1 << num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());

                    if ((result & 1 << num) != 0) sb.append(1).append('\n');
                    else sb.append(0).append('\n');

                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());

                    if ((result & 1 << num) != 0) result &= ~(1 << num);
                    else result |= 1 << num;

                    break;
                case "all":
                    result |= ~0;
                    break;
                default:
                    result = 0;
                    break;
            }
        }

        System.out.println(sb);

        br.close();
    }
}