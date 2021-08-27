import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long result = 0;

        Calc calc = new Calc();
        result = calc.calc(num);

        System.out.print(result);
    }
}

class Calc {
    long[] t = new long[36];

    public long calc(int num) {
        t[0] = 1;
        t[1] = 1;
        t[2] = 2;
        int count = 3;
        long temp = 0;

        while(num >= count) {
            for (int i = 0; i < count; i++) {
                temp += t[i] * t[count - (i + 1)];
            }
            t[count] = temp;
            temp = 0;
            count++;
        }

        return t[num];
    }
}
