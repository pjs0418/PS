import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arrN = new int[n];

        for(int i = 0;i < n;i++) {
            arrN[i] = input.nextInt();
        }

        Arrays.sort(arrN);

        int maxN = arrN[n - 1];
        int minN = arrN[0];

        int m = input.nextInt();
        int[] arrM = new int[m];
        int left, right, mid = 0;

        for(int i = 0;i < m;i++) {
            arrM[i] = input.nextInt();
            left = 0;
            right = n - 1;

            if(arrM[i] > maxN) {
                System.out.println(0);
                continue;
            }

            if(arrM[i] < minN) {
                System.out.println(0);
                continue;
            }

            while(left <= right) {

                mid = (left + right) / 2;

                if(arrN[mid] == arrM[i]) {
                    System.out.println(1);
                    break;
                }
                else if(arrN[mid] > arrM[i]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            if(arrN[mid] != arrM[i]) {
                System.out.println(0);
            }
        }
    }
}

