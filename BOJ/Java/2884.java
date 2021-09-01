import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int h = input.nextInt();
        int m = input.nextInt();

        if(m >= 45) {
            System.out.print(h);
            System.out.print(' ');
            System.out.print(m - 45);
        }
        else if(h == 0){
            System.out.print(23);
            System.out.print(' ');
            System.out.print(m + 15);
        }
        else {
            System.out.print(h - 1);
            System.out.print(' ');
            System.out.print(m + 15);
        }
    }
}
