import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String[][] arr = new String[num][2];

        for(int i = 0;i < num;i++) {
            arr[i][0] = input.next();
            arr[i][1] = input.next();
        }

        Arrays.sort(arr, Comparator.comparingInt(s -> Integer.parseInt(s[0])));

        for(int i = 0;i < num;i++)
            System.out.println(arr[i][0] + ' ' + arr[i][1]);
    }
}
