import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            int[] alphabet = new int[26];

            for (int i = 0; i < str.length(); i++) {

                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    alphabet[str.charAt(i) - 97]++;
                }
                else {
                    alphabet[str.charAt(i) - 65]++;
                }

            }

            int maxCount = -1;
            char ch = '?';

            for (int i = 0; i < 26; i++) {

                if (maxCount < alphabet[i]) {
                    maxCount = alphabet[i];
                    ch = (char)(i + 65);
                }
                else if(alphabet[i] == maxCount) {
                    ch = '?';
                }

            }

            br.close();

            System.out.print(ch);
        }
        catch(IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}