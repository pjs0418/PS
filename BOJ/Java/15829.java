import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result = 0;

        for(int i = 0;i < L;i++) {
            char temp = str.charAt(i);
            int decimal = temp - 96;

            long modular = 1;
            for(int j = 0;j < i;j++) {
                modular *= 31;
                modular %= 1234567891;
            }
            result += decimal * modular;
        }

        System.out.println(result % 1234567891);

        br.close();
    }
}