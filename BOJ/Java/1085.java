import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();

        if(x >= (w - x)) {
            x = w - x;
        }

        if(y >= (h - y)) {
            y = h - y;
        }

        if(x >= y) {
            System.out.print(y);
        }
        else {
            System.out.print(x);
        }
    }
}