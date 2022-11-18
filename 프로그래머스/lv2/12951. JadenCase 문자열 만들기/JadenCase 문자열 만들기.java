class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.charAt(0) > 96) answer += (char)(s.charAt(0) - 32);
        else answer += s.charAt(0);
        
        for(int i = 1;i < s.length();i++) {
            if(s.charAt(i - 1) == 32) {
                if(s.charAt(i) > 96) answer += (char)(s.charAt(i) - 32);
                else answer += s.charAt(i);
            } else {
                if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
                    answer += (char)(s.charAt(i) + 32);
                else answer += s.charAt(i);
            }
        }
        
        return answer;
    }
}