class Solution {
    public String solution(String new_id) {
        
        // 1단계
        String answer = new_id.toLowerCase();
        
        // 2단계
        for(int i=0;i<answer.length();i++) {
            char ch = answer.charAt(i);
            
            if((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9') ||
                ch == '.' || ch == '-' || ch == '_') continue;
            
            answer = answer.replace(ch, ' ');
        }
        answer = answer.replace(" ", "");
        
        // 3단계
        answer = answer.replaceAll("\\.+", ".");
        
        // 4단계
        if(!answer.isEmpty() && answer.charAt(0) == '.') 
            answer = answer.substring(1);
        
        if(!answer.isEmpty() && answer.charAt(answer.length()-1) == '.') {
            int idx = answer.lastIndexOf(".");
            answer = answer.substring(0, answer.length()-1);
        }
        
        // 5단계
        if(answer.isEmpty()) 
            answer = "a";
        
        // 6단계
        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
            
            if(!answer.isEmpty() && answer.charAt(14) == '.') {
                int idx = answer.lastIndexOf(".");
                answer = answer.substring(0, answer.length()-1);
            }
        }
        
        // 7단계
        while(answer.length() <= 2) {
            answer += answer.charAt(answer.length()-1);
        }
        return answer;
    }
}