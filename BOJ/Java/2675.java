import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numOfTestCase = input.nextInt();

        for(int i = 0;i < numOfTestCase;i++) {
            int repeat = input.nextInt();

            String string = input.next();

            for(int j = 0;j < string.length();j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(string.charAt(j));
                }
            }
            System.out.println();
        }
    }
}