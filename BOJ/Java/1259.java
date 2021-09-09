import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String num;
        String reversedNum;

        while(true) {
            num = input.next();

            if(num.equals("0")) {
                return;
            }

            StringBuffer sb = new StringBuffer(num);
            reversedNum = sb.reverse().toString();

            if(num.equals(reversedNum)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
