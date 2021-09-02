import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] remainder = new int[42];
        int num;
        int count = 0;

        for(int i = 0;i < 10;i++) {
            num = input.nextInt();
            remainder[num % 42]++;
        }

        for(int i = 0;i < 42;i++) {
            if(remainder[i] != 0) {
                count++;
            }
        }

        System.out.print(count);
    }
}
