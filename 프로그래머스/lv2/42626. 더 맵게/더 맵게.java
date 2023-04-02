import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int s : scoville) {
            queue.add(s);
        }
        
        while(queue.peek() < K && queue.size() > 1) {
            int firstLow = queue.poll();
            int secondLow = queue.poll();
            
            queue.add(firstLow + secondLow * 2);
            answer++;
        }
        
        if(queue.poll() < K) {
            return -1;
        }
        
        return answer;
    }
}