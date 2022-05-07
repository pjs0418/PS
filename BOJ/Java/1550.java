import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String oct = br.readLine();
        int num = 0;
        StringBuffer sb = new StringBuffer(oct);
        String reversedOct = sb.reverse().toString();

        for (int i = 0; i < oct.length(); i++) {
            char temp = reversedOct.charAt(i);
            if (temp >= '0' && temp <= '9') num += (temp - 48) * (int) Math.pow(16, i);
            else num += (temp - 55) * (int) Math.pow(16, i);
        }

        System.out.println(num);

        br.close();
    }
}