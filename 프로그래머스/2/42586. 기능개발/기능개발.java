import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<progresses.length;i++) {
            int finish = (100 - progresses[i]) / speeds[i]
                            + (((100 - progresses[i]) % speeds[i] == 0) ? 0 : 1);
            q.offer(finish);
        }
        
        System.out.println(q);
        
        List<Integer> list = new ArrayList<>();
        int finish = q.poll();
        int cnt = 1;
        
        while(!q.isEmpty()) {
            if(q.peek() <= finish) {
                cnt++; q.poll();
            } else {
                list.add(cnt);
                finish = q.poll();
                cnt = 1;
            }
        }
        list.add(cnt);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}