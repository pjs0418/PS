import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.charAt(0) == '.')
                break;

            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(')
                    left.push('(');
                else if (str.charAt(i) == ')')
                    left.push(')');
                else if (str.charAt(i) == '[')
                    left.push('[');
                else if (str.charAt(i) == ']')
                    left.push(']');
            }

            if (left.isEmpty()) {
                System.out.println("yes");
                continue;
            }

            int temp = left.size();

            for (int i = 0; i < temp; i++) {
                if (left.peek() == ')')
                    right.push(left.pop());
                else if (left.peek() == ']')
                    right.push(left.pop());
                else if (left.peek() == '(') {
                    if (right.isEmpty())
                        break;
                    else {
                        if (right.peek() != ')')
                            break;
                        else {
                            left.pop();
                            right.pop();
                        }
                    }
                } else if (left.peek() == '[') {
                    if (right.isEmpty())
                        break;
                    else {
                        if (right.peek() != ']')
                            break;
                        else {
                            left.pop();
                            right.pop();
                        }
                    }
                }
            }

            if (left.isEmpty() && right.isEmpty())
                System.out.println("yes");
            else
                System.out.println("no");
        }

        br.close();
    }
}