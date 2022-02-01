import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] arr = new long[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        long max = arr[0];
        int count = 1, maxCount = 0;

        for(int i = 1;i < num;i++) {
            if(arr[i - 1] == arr[i])
                count++;
            else
                count = 1;

            if(count > maxCount) {
                maxCount = count;
                max = arr[i - 1];
            }
        }

        System.out.println(max);

        br.close();
    }
}
