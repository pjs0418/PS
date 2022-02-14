import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        int starIdx = pattern.indexOf('*');
        String before = pattern.substring(0, starIdx);
        String after = pattern.substring(starIdx + 1);

        for (int i = 0; i < N; i++) {
            String fileName = br.readLine();

            if (pattern.length() - 1 > fileName.length()) {
                System.out.println("NE");
                continue;
            }

            String tempPatternBefore = fileName.substring(0, before.length());
            String tempPatternAfter = fileName.substring(fileName.length() - after.length());

            if (tempPatternBefore.contentEquals(before) && tempPatternAfter.contentEquals(after))
                System.out.println("DA");
            else System.out.println("NE");
        }

        br.close();
    }
}