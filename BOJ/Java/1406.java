import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        int M = Integer.parseInt(br.readLine());

        for(int i = 0;i < str.length();i++)
            left.push(str.substring(i, i + 1));

        for(int i = 0;i < M;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();

            switch(temp) {
                case "B":
                    if (!left.isEmpty())
                        left.pop();
                    break;
                case "L":
                    if (!left.isEmpty())
                        right.push(left.pop());
                    break;
                case "D":
                    if (!right.isEmpty())
                        left.push(right.pop());
                    break;
                case "P":
                    left.push(st.nextToken());
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!left.isEmpty())
            right.push(left.pop());

        while(!right.isEmpty())
            sb.append(right.pop());

        System.out.println(sb);

        br.close();
    }
}