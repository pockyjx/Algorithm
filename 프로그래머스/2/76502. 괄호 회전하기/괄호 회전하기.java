import java.util.*;
class Solution {
    public int solution(String s) {
        
        int answer = 0;
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<len;i++) {
            for(int j=0;j<len;j++) {
                char ch = s.charAt(j);
                
                if(ch == '[' || ch == '(' || ch == '{') {
                    stack.push(ch);
                } 
                
                else if(!stack.empty()) {
                    char peek = stack.peek();
                    
                    if(ch == ']' && peek == '[') stack.pop();
                    if(ch == ')' && peek == '(') stack.pop();
                    if(ch == '}' && peek == '{') stack.pop();
                }
                
                else {
                    stack.push(ch); break;
                }
            }
        
            if(stack.size() == 0) answer++; 
            
            s = s.substring(1, len) + s.charAt(0);
            stack.clear();
        }
        
        return answer;
    }
}