import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        int tempNum = -1;

        for(int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();

            if(temp.contentEquals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(num);
                tempNum = num;
            }
            else if(temp.contentEquals("pop")) {
                if(queue.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(queue.poll());
            }
            else if(temp.contentEquals("size"))
                System.out.println(queue.size());
            else if(temp.contentEquals("empty")) {
                if (queue.size() == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if(temp.contentEquals("front")) {
                if(queue.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(queue.peek());
            }
            else {
                if(queue.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(tempNum);
            }
        }
    }
}
