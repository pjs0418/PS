import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String[] stringNum = s.split("\\W");
        int[] num = new int[stringNum.length];
        int[] tempResult = new int[30];
        int temp = 0;
        StringBuilder op = new StringBuilder();

        for (int i = 0; i < num.length; i++) num[i] = Integer.parseInt(stringNum[i]);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') op.append(s.charAt(i));
        }

        int result = num[0];
        if (!s.contains("-")) {
            for (int i = 1; i < num.length; i++) result += num[i];
        } else if (!s.contains("+")) {
            for (int i = 1; i < num.length; i++) result -= num[i];
        } else {
            for (int i = 0; i < op.length(); i++) {
                if (op.charAt(i) == '+') result += num[i + 1];
                else {
                    tempResult[temp] = result;
                    result = num[i + 1];
                    temp++;
                }
            }

            tempResult[temp] = result;
            result = tempResult[0];

            for (int i = 1; i < tempResult.length; i++) result -= tempResult[i];
        }

        System.out.println(result);
    }
}