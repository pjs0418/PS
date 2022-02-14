import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static List<String> arrList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int temp = (int) (Math.pow(2, K) - 1);
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < temp; i++) strList.add(st.nextToken());

        List<String> arr = midArr(strList, 0);

        String[] tempArr = new String[K];
        Arrays.fill(tempArr, "");

        for (int i = 0; i < temp; i++) {
            String tempStr = arr.get(i);
            int strLen = tempStr.length();

            tempArr[tempStr.charAt(strLen - 1) - 48] += tempStr.substring(0, strLen - 1) + " ";
        }

        for (int i = 0; i < K; i++) {
            System.out.println(tempArr[i]);
        }

        br.close();
    }

    static List<String> midArr(List<String> strList, int level) {

        if (strList.size() == 1) arrList.add(strList.get(0) + level);
        else {
            int temp = strList.size() / 2;
            arrList.add(strList.get(temp) + level);
            List<String> before = strList.subList(0, temp);
            List<String> after = strList.subList(temp + 1, strList.size());

            midArr(before, level + 1);
            midArr(after, level + 1);
        }

        return arrList;
    }
}