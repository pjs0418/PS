import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int maxNum = 0;
        int maxNumIdx = 0;

        for(int i = 0;i < 9;i++) {
            num = input.nextInt();

            if(num >= maxNum) {
                maxNum = num;
                maxNumIdx = i + 1;
            }
        }

        System.out.println(maxNum);
        System.out.println(maxNumIdx);
    }
}