import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer;
        Set<String> wordSet = new HashSet<>();
        int check = 0;
        char c = words[0].charAt(words[0].length() - 1);
        wordSet.add(words[0]);
        
        for(int i = 1;i < words.length;i++) {
            if(wordSet.contains(words[i])) {
                check = i;
                break;
            }
            
            if(words[i].charAt(0) != c) {
                check = i;
                break;
            }
            
            c = words[i].charAt(words[i].length() - 1);
            wordSet.add(words[i]);
        }
        
        if(check == 0) {
            return new int[]{0, 0};
        }
    
        answer = new int[2];
        
        for(int i = 0;i < n;i++) {
            if(check % n == i) {
                answer[0] = i + 1;
            }
        }
        
        answer[1] = check / n + 1;

        return answer;
    }
}