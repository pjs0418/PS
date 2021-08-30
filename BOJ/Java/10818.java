import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int maxNum, minNum;
        int[] arr = new int[num];

        for(int i = 0;i < num;i++) {
            arr[i] = input.nextInt();
        }

        maxNum = minNum = arr[0];

        for(int i = 1;i < num;i++) {
            if(maxNum <= arr[i]) {
                maxNum = arr[i];
            }

            if(minNum >= arr[i]) {
                minNum = arr[i];
            }
        }

        System.out.println(minNum);
        System.out.println(maxNum);
    }
}