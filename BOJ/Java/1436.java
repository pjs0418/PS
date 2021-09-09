import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int startNum = 666;
        int count = 1;

        while(true) {
            if(count == num) {
                break;
            }

            startNum++;

            if(Integer.toString(startNum).contains("666")){
                count++;
            }
        }

        System.out.print(startNum);
    }
}
