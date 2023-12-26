class Solution {
    public String solution(String s, int n) {
        
        String answer = "";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            
            if(Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            } else if(Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }
            
            answer += ch;
        }
        return answer;
    }
}