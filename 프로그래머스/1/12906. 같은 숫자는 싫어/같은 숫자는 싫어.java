import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        
        for(int i=1;i<arr.length;i++) {
            if(s.peek() == arr[i]) continue;
            s.push(arr[i]);
        }
        
        int[] answer = new int[s.size()];
        for(int i=s.size()-1;i>=0;i--) {
            answer[i] = s.pop();
        }
        
        return answer;
    }
}