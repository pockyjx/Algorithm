import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<Integer> q = new LinkedList<>();
        for(int i : priorities) {
            q.offer(i);
        }   
        
        Arrays.sort(priorities);
        System.out.println(Arrays.toString(priorities));
        
        int answer =  0;
        int len = priorities.length - 1;
        
        while(!q.isEmpty()) {
            int tmp = q.poll();
            if(tmp == priorities[len - answer]) {
                answer++; location--;
                if(location < 0) break;
            } else {
                q.offer(tmp); location--;
                if(location < 0) location = q.size() - 1;
            }
        }
        
        return answer;
    }
}