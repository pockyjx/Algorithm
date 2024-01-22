import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0)+1);
        }
        
        List<Integer> value = new ArrayList<>(map.values());
        Collections.sort(value, Collections.reverseOrder());
        
        int total = 0;
        int cnt = 0;
        
        for(int v : value) {
            total += v;
            cnt++;
            
            if(total >= k) break;
        }
        return cnt;
    }
}