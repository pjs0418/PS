import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.next();
        char ch = str.charAt(0);

        System.out.print((int)ch);
    }
}