class Solution {
    public int[] solution(int n, int s) {        
        if(s / n == 0) {
            return new int[]{-1};
        }
        
        int temp = s / n;
        int[] answer = new int[n];
        
        if(s % n == 0) {
            for(int i = 0;i < n;i++) {
                answer[i] = temp;
            }
        } else {
            int rem = s % n;
            
            for(int i = 0;i < n - rem;i++) {
                answer[i] = temp;
            }
            for(int i = n - rem;i < n;i++) {
                answer[i] = temp + 1;
            }
        }
        
        return answer;
    }
}