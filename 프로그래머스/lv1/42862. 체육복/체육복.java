import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] student = new boolean[n + 4];
        
        for(int l : lost) {
            student[l] = true;
        }
        
        Arrays.sort(reserve);
        
        for(int i = 0;i < reserve.length;i++) {
            if(student[reserve[i]]) {
                student[reserve[i]] = false;
                reserve[i] = n + 2;
            }
        }
        
        for(int r : reserve) {
            if(student[r - 1]) {
                student[r - 1] = false;
            } else if(student[r + 1]) {
                student[r + 1] = false;
            }
        }
        
        for(boolean s : student) {
            if(!s) {
                answer++;
            }
        }
        
        return answer - 4;
    }
}