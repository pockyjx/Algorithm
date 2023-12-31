import java.util.*;
class Solution {
    public List<Integer> solution(int N, int[] stages) {
        
        int[] cnt = new int[N]; // 실패한 사람
        for(int i=0;i<stages.length;i++) {
            if(stages[i] > N) continue;
            cnt[stages[i]-1]++;
        }
        
        Map<Integer, Double> map = new HashMap<>(); // <스테이지, 실패율>
        int player = stages.length; // 해당 스테이지에 도달한 사람
        
        for(int i=0;i<N;i++) {
            if(player == 0) {
                map.put(i+1, 0.0);
            } else {           
                map.put(i+1, (double)cnt[i]/player);
                player -= cnt[i];
            }
        }
        
        List<Integer> key = new ArrayList<>(map.keySet());
        Collections.sort(key, (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return key;
    }       
}