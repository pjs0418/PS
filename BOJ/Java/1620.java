import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> mapForName = new HashMap<>();
        HashMap<String, Integer> mapForNum = new HashMap<>();

        for (int i = 1; i < N + 1; i++) {
            String name = br.readLine();

            mapForName.put(i, name);
            mapForNum.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String temp = br.readLine();

            if (temp.charAt(0) >= '1' && temp.charAt(0) <= '9')
                System.out.println(mapForName.get(Integer.parseInt(temp)));
            else System.out.println(mapForNum.get(temp));
        }

        br.close();
    }
}