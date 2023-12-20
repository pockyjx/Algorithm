import java.util.*;
class Solution {
    public int solution(int n) {
        
        Stack<Integer> s = new Stack<>();
        
        int cnt = 0;
        while(n > 0) {
            cnt++;
            s.push(n%3);
            n /= 3;
        }
        
        int answer = 0;
        for(int i=0;i<cnt;i++) {
            System.out.print(i + " ");
            answer += s.pop() * Math.pow(3, i);
        }
 
        return answer;
    } 
}