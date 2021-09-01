import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int temp, sum = 0;

        for(int i = 0;i < 5;i++) {
            temp = input.nextInt();

            sum += temp * temp;
        }

        System.out.print(sum % 10);
    }
}
