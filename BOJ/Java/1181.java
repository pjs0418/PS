import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int numOfWords = Integer.parseInt(br.readLine());
            String[] words = new String[numOfWords];

            for(int i = 0;i < numOfWords;i++) {
                words[i] = br.readLine();
            }

            Arrays.sort(words, new Comparator<String>() {

                @Override
                public int compare(String o1, String o2) {
                    //return 값이 양수이면 순서 바뀌는 듯
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                    else {
                        return o1.length() - o2.length();
                    }
                }
            });

            ArrayList<String> wordList = new ArrayList<>();

            for(String item: words) {
                if(!wordList.contains(item))
                    wordList.add(item);
            }

            for(String word: wordList) {
                System.out.println(word);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
