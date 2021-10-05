import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        int n, m, count, checkIdx;
        LinkedList<int []> queue = new LinkedList<>();
        int[] checkNum;
        int tempNum;

        for(int i = 0;i < testCase;i++) {

            n = input.nextInt();
            m = input.nextInt();
            count = 0;
            queue.clear();

            for(int j = 0;j < n;j++) {
                queue.add(new int [] {j, input.nextInt()});
            }

            while(true) {

                checkIdx = -1;
                checkNum = queue.get(0);
                tempNum = checkNum[1];

                for(int j = 0;j < queue.size();j++) {
                    if(queue.get(j)[1] > tempNum) {
                        checkIdx = j;
                        tempNum = queue.get(j)[1];
                    }
                }

                if(checkIdx == -1) {

                    if(checkNum[0] == m) {
                        System.out.println(count + 1);
                        break;
                    }

                    if(tempNum != 1) {
                        count++;
                        queue.remove();
                        continue;
                    }

                    for(int j = 0;j < queue.size();j++) {
                        if(queue.get(j)[0] == m) {
                            break;
                        }
                        else {
                            count++;
                        }
                    }

                    System.out.println(count + 1);
                    break;
                }
                else {
                    for(int j = 0;j < checkIdx;j++) {
                        queue.add(queue.get(0));
                        queue.remove();
                    }
                }
            }
        }
    }
}