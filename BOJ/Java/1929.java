import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        ArrayList<Integer> prime = new ArrayList<>();

        prime.add(0);
        prime.add(0);

        for(int i = 2;i <= n;i++) {
            prime.add(i);
        }

        for(int i = 2;i <= n;i++) {
            for(int j = i * 2;j <= n;j += i) {
                if(prime.get(j) != 0) {
                    prime.set(j, 0);
                }
            }
        }

        for(int i = m;i <= n;i++) {
            if(prime.get(i) != 0) {
                System.out.println(i);
            }
        }
    }
}