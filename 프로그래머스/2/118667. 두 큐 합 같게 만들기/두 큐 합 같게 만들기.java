import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = 0;
        long sum2 = 0;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for(int i=0;i<queue1.length;i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            
            sum1 += queue1[i];
            sum2 += queue2[i];
        }
        
        while(sum1 != sum2) {
            if(answer > (queue1.length + queue2.length) * 2) return -1;
            
            int tmp = 0;
            if(sum1 > sum2) {
                tmp = q1.poll();
                q2.add(tmp);
                
                sum1 -= tmp;
                sum2 += tmp;
            } 
            
            else if(sum1 < sum2) {
                tmp = q2.poll();
                q1.add(tmp);
                
                sum2 -= tmp;
                sum1 += tmp;
            }
            
            answer++;
        }
        
        return answer;
    }
}