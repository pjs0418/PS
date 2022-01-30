import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String[][] arr = new String[num][4];

        for(int i = 0;i < num;i++) {
            arr[i][0] = input.next();
            arr[i][1] = input.next();
            arr[i][2] = input.next();
            arr[i][3] = input.next();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1].contentEquals(o2[1])) {
                if(o1[2].contentEquals(o2[2])) {
                    if(o1[3].contentEquals(o2[3]))
                        return o1[0].compareTo(o2[0]);
                    else
                        return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                }
                else
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
            }
            else
                return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
        });

        for(int i = 0;i < num;i++)
            System.out.println(arr[i][0]);
    }
}
