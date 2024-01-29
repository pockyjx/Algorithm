import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        
        priorities[location] += 10;
        Queue<Integer> q = new LinkedList<>();
        for(int i : priorities) {
            q.offer(i);
        }   
        
        int answer = 0;
        while(!q.isEmpty()) {

            int max = 0;          
            for(int i : q) {
                int tmp = (i > 10) ? i - 10 : i;
                max = Math.max(max, tmp);
            }    
            
            for(int i=0;i<q.size();i++) {
                if(q.peek() - 10 == max || q.peek() == max) break;
                q.offer(q.poll());
            }
            
            answer++;
            if(q.poll() > 10) break;
        }
        
        return answer;
    }
}