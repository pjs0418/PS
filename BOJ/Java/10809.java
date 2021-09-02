import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();
        int count = 0;

        for(int i = 0;i < 26;i++) {
            for(int j = 0;j < word.length();j++) {

                count++;

                if((char)(i + 97) == word.charAt(j)) {
                    System.out.print(j + " ");
                    count = 0;
                    break;
                }
            }

            if(count == word.length()) {
                System.out.print(-1 + " ");
                count = 0;
            }
        }
    }
}