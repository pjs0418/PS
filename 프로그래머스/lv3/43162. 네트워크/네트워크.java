import java.util.*;

class Solution {
    private int answer;
    private boolean[] computer;

    public int solution(int n, int[][] computers) {
        answer = 0;
        computer = new boolean[n];
        
        for(int i = 0;i < computers.length;i++) {
            if(!computer[i]) {
                bfs(i, computers);
            }
        }
        
        return answer;
    }
    
    public void bfs(int index, int[][] computers) {
        computer[index] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            
            for(int i = 0;i < computers[temp].length;i++) {
                if(computers[temp][i] == 1 && !computer[i]) {
                    computer[i] = true;
                    queue.add(i);
                }
            }
        }
        
        answer++;
    }
}