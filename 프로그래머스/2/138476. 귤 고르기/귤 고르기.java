import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        if(k == 1) return 1;
            
        Map<Integer, Integer> map = new HashMap<>();
        for(int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> value = new ArrayList<>(map.values());
        Collections.sort(value, Collections.reverseOrder());
        
        int answer = 0;
        for(int v : value) {
            k -= v;
            answer++;
            
            if(k <= 0) break;
        }
        
        return answer;
    }
}