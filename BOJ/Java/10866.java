import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();

            if(temp.contentEquals("push_front"))
                deque.addFirst(Integer.parseInt(st.nextToken()));
            else if(temp.contentEquals("push_back"))
                deque.addLast(Integer.parseInt(st.nextToken()));
            else if(temp.contentEquals("pop_front")) {
                if(deque.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(deque.pollFirst());
            }
            else if(temp.contentEquals("pop_back")) {
                if(deque.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(deque.pollLast());
            }
            else if(temp.contentEquals("size"))
                System.out.println(deque.size());
            else if(temp.contentEquals("empty")) {
                if(deque.size() == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if(temp.contentEquals("front")) {
                if(deque.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(deque.peekFirst());
            }
            else {
                if(deque.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(deque.peekLast());
            }
        }
    }
}
