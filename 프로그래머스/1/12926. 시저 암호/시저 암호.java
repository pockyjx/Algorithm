class Solution {
    public String solution(String s, int n) {
        
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == ' ') {
                answer += " "; continue;
            }
            
            int ch = arr[i] + n;
            if(ch > 90 && arr[i] <= 90) ch = 65 + (ch-91);
            else if(ch > 122) ch = (97 + (ch-123));
            
            answer += String.valueOf((char)ch);
        }
        return answer;
    }
}