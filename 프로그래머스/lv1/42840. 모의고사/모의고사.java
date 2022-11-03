import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] correct = {0, 0, 0};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0;i < answers.length;i++) {
            int oneTemp = i % 5;
            int twoTemp = i % 8;
            int threeTemp = i % 10;
            
            if(answers[i] == one[oneTemp]) correct[0]++;
            if(answers[i] == two[twoTemp]) correct[1]++;
            if(answers[i] == three[threeTemp]) correct[2]++;
        }
        
        int max = 0;
        for(int i = 0;i < 3;i++) {
            if(max <= correct[i]) max = correct[i];
        }
        
        int count = 0;
        for(int i = 0;i < 3;i++) {
            if(max == correct[i]) count++;
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0;i < 3;i++) {
            if(max == correct[i]) {
                answer[index] = i + 1;
                index++;
            }
        }
        
        return answer;
    }
}