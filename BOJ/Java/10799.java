import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int stick = 0, count = 0;

        for(int i = 0;i < input.length() - 1;i++) {
            if(input.charAt(i) == '(' && input.charAt(i + 1) == ')')
                count += stick;
            else if(input.charAt(i) == '(' && input.charAt(i + 1) == '(')
                stick++;
            else if(input.charAt(i) == ')' && input.charAt(i + 1) == ')') {
                count++;
                stick--;
            }
        }

        System.out.println(count);

        br.close();
    }
}
