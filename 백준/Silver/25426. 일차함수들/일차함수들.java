import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        BigInteger result = new BigInteger("0");
        int x = 1;
        for (int i = 0; i < N; i++) {
            BigInteger temp = new BigInteger(Integer.toString(arr[i][0]));
            temp = temp.multiply(BigInteger.valueOf(x));
            result = result.add(temp).add(BigInteger.valueOf(arr[i][1]));
            x++;
        }

        System.out.println(result);
    }
}