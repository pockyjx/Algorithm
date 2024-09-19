import java.util.*;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            
            if(stack.isEmpty() || stack.peek() != ch) stack.push(ch);
            else stack.pop();
        }
    
        return stack.size() == 0 ? 1 : 0;
    }
}