import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        if ("A+".equals(str)) {
            System.out.println(4.3);
        } else if ("A0".equals(str)) {
            System.out.println(4.0);
        } else if ("A-".equals(str)) {
            System.out.println(3.7);
        } else if ("B+".equals(str)) {
            System.out.println(3.3);
        } else if ("B0".equals(str)) {
            System.out.println(3.0);
        } else if ("B-".equals(str)) {
            System.out.println(2.7);
        } else if ("C+".equals(str)) {
            System.out.println(2.3);
        } else if ("C0".equals(str)) {
            System.out.println(2.0);
        } else if ("C-".equals(str)) {
            System.out.println(1.7);
        } else if ("D+".equals(str)) {
            System.out.println(1.3);
        } else if ("D0".equals(str)) {
            System.out.println(1.0);
        } else if ("D-".equals(str)) {
            System.out.println(0.7);
        } else {
            System.out.println(0.0);
        }
    }
}