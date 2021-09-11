import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        int check = 0;
        ArrayList<Character> temp = new ArrayList<Character>();

        for(int i = 0;i < n;i++) {
            arr[i] = input.nextInt();

            if(check < arr[i]) {
                for(int j = check + 1;j <= arr[i];j++) {
                    stack.push(j);
                    temp.add('+');
                }

                check = arr[i];

                if(arr[i] == stack.peek()) {
                    temp.add('-');
                    stack.pop();
                }
            }
            else {
                if(arr[i] == stack.peek()) {
                    temp.add('-');
                    stack.pop();
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        for(int i = 0;i < temp.size();i++) {
            System.out.println(temp.get(i));
        }
    }
}
