import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        long[] kLen = new long[k];
        long max = 0;
        long left = 1, right, mid;
        int count = 0;
        long result = 1;

        for(int i = 0;i < k;i++) {

            kLen[i] = input.nextInt();

            if(max < kLen[i]) {
                max = kLen[i];
            }
        }

        right = max;

        while(left <= right) {

            mid = (left + right) / 2;

            for(int i = 0;i < k;i++) {
                count += kLen[i] / mid;
            }

            if(count < n) {
                right = mid - 1;
            }
            else {
                if(result < mid) {
                    result = mid;
                }

                left = mid + 1;
            }

            count = 0;
        }

        System.out.print(result);
    }
}
