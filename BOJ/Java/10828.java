import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();

            if(temp.contentEquals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }
            else if(temp.contentEquals("pop")) {
                if(stack.empty())
                    System.out.println(-1);
                else {
                    System.out.println(stack.peek());
                    stack.pop();
                }
            }
            else if(temp.contentEquals("size"))
                System.out.println(stack.size());
            else if(temp.contentEquals("empty")) {
                if(stack.empty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else {
                if (stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.peek());
            }
        }

        br.close();
    }
}
