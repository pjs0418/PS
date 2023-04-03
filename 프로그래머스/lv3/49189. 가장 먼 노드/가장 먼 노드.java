import java.util.*;

class Solution {
    private boolean[][] graph;
    private int[] distance;
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        graph = new boolean[n + 1][n + 1];
        distance = new int[n + 1];
        
        for(int[] e : edge) {
            graph[e[0]][e[1]] = graph[e[1]][e[0]] = true;
        }
        
        int max = bfs(n);
        
        for(int i = 2;i < n + 1;i++) {
            if(distance[i] == max) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public int bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        int max = 1;
        boolean[] check = new boolean[n + 1];
        
        for(int i = 2;i < n + 1;i++) {
            if(graph[1][i]) {
                queue.add(i);
                distance[i] = 1;
                check[i] = true;
            }
        }
        
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            
            for(int i = 2;i < n + 1;i++) {
                if(!check[i] && graph[temp][i]) {
                    queue.add(i);
                    distance[i] = distance[temp] + 1;
                    check[i] = true;
                    
                    if(max < distance[i]) {
                        max = distance[i];
                    }
                }
            }
        }
        
        return max;
    }
}