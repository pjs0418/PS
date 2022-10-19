import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            double[][] list = new double[5][2];

            for (int j = 0; j < 5; j++) {
                String time = st.nextToken();
                String[] temp = time.split(":");
                int hh = Integer.parseInt(temp[0]);
                int mm = Integer.parseInt(temp[1]);

                int minute = hh * 60 + mm;
                if (hh > 11) hh -= 12;
                double angle = hh * 30 + mm * 0.5 - mm * 6;
                if (angle < 0) angle = 360 + angle;
                if (angle > 180) angle = 360 - angle;

                list[j][0] = angle;
                list[j][1] = minute;
            }

            Arrays.sort(list, (o1, o2) -> {
                if (o1[0] == o2[0]) return Double.compare(o1[1], o2[1]);
                else return Double.compare(o1[0], o2[0]);
            });

            int h = (int) list[2][1] / 60;
            int m = (int) list[2][1] % 60;
            String tempH;
            String tempM;
            if (h < 10) tempH = "0" + h;
            else tempH = Integer.toString(h);
            if (m < 10) tempM = "0" + m;
            else tempM = Integer.toString(m);

            System.out.println(tempH + ":" + tempM);
        }
    }
}