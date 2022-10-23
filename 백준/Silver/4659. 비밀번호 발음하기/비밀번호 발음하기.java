import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String password = st.nextToken();

            if (password.equals("end")) break;

            if (password.length() == 1 &&
                    (password.equals("a") || password.equals("e") || password.equals("i") ||
                            password.equals("o") || password.equals("u"))) {
                System.out.println("<" + password + "> is acceptable.");
                continue;
            }

            if (!password.contains("a") && !password.contains("e") && !password.contains("i") &&
                    !password.contains("o") && !password.contains("u")) {
                System.out.println("<" + password + "> is not acceptable.");
                continue;
            }

            boolean check = false;
            for (int i = 0; i < password.length() - 1; i++) {
                if (password.charAt(i) == password.charAt(i + 1) &&
                        (password.charAt(i) != 'e' && password.charAt(i) != 'o')) {
                    System.out.println("<" + password + "> is not acceptable.");
                    check = true;
                    break;
                }
            }

            if (check) continue;

            int[] flag = new int[3];
            for (int i = 0; i < password.length() - 2; i++) {
                for (int j = i; j < i + 3; j++) {
                    if (password.charAt(j) == 'a' || password.charAt(j) == 'e' ||
                            password.charAt(j) == 'i' || password.charAt(j) == 'o' ||
                            password.charAt(j) == 'u') flag[j % 3] = 0;
                    else flag[j % 3] = 1;
                }

                if (flag[0] == flag[1] && flag[1] == flag[2]) {
                    System.out.println("<" + password + "> is not acceptable.");
                    check = true;
                    break;
                }
            }

            if (check) continue;

            System.out.println("<" + password + "> is acceptable.");
        }
    }
}