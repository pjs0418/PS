import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];

        for(int i = 1;i < N + 1;i++) {
            arr[i] += i;

            for(int j = 0;j < Integer.toString(i).length();j++) {
                char temp = Integer.toString(i).charAt(j);
                arr[i] += Integer.parseInt(String.valueOf(temp));
            }
        }

        int check = 0;
        for(int i = 1;i < N + 1;i++) {
            if(arr[i] == N) {
                check = i;
                System.out.println(check);
                break;
            }
        }

        if(check == 0) System.out.println(check);

        br.close();
    }
}