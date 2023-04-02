class Solution {
    private int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        dfs(0, numbers, target, 0);
        
        return answer;
    }
    
    public void dfs(int depth, int[] numbers, int target, int result) {
        if(depth == numbers.length) {
            if(target == result) {
                answer++;
            }
        } else {
            dfs(depth + 1, numbers, target, result - numbers[depth]);
            dfs(depth + 1, numbers, target, result + numbers[depth]);
        }
    }
}