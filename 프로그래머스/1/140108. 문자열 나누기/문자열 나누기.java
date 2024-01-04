class Solution {
    public int solution(String s) {
        
        int answer = 0;
        int first = 0;
        int other = 0;
        
        char x = ' ';
        for(int i=0;i<s.length();i++) {
            if(first == other) {
                answer++;
                x = s.charAt(i);
            }
            
            if(s.charAt(i) == x) first++;
            else other++;
        }
        
        return answer;
    }
}