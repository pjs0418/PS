import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.next();
        String b = input.next();

        StringBuffer sbA = new StringBuffer(a);
        StringBuffer sbB = new StringBuffer(b);

        String reverseA = sbA.reverse().toString();
        String reverseB = sbB.reverse().toString();

        int intA = Integer.parseInt(reverseA);
        int intB = Integer.parseInt(reverseB);

        if(intA > intB) {
            System.out.print(intA);
        }
        else {
            System.out.print(intB);
        }
    }
}
