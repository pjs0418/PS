import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        int result = 0;

        int index = 0;
        int count = -1;
        while (index < S.length()) {
            if (count == -1) {
                if (S.charAt(index) == 'I') count++;
                index++;
            } else if (count == N) {
                if (index < S.length() - 1) {
                    if (S.charAt(index) == 'O' && S.charAt(index + 1) == 'I') {
                        index += 2;
                        result++;
                    } else if (S.charAt(index) == 'I' && S.charAt(index + 1) == 'I') {
                        count = 0;
                        index += 2;
                    } else if (S.charAt(index) == 'O' && S.charAt(index + 1) == 'O') {
                        count = -1;
                        index += 2;
                    } else {
                        count = 0;
                        index++;
                    }
                } else break;
            } else {
                if (index < S.length() - 1) {
                    if (S.charAt(index) == 'O' && S.charAt(index + 1) == 'I') {
                        index += 2;
                        count++;
                        if(count == N) result++;
                    } else if (S.charAt(index) == 'I' && S.charAt(index + 1) == 'I') {
                        count = 0;
                        index += 2;
                    } else if (S.charAt(index) == 'O' && S.charAt(index + 1) == 'O') {
                        count = -1;
                        index += 2;
                    } else {
                        count = 0;
                        index++;
                    }
                } else break;
            }
        }

        System.out.println(result);
    }
}