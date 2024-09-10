import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : array) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        int answer = 0;
        int max = 0;
        int cnt = 0;
        for(int key : map.keySet()) {
            int tmp = map.get(key);
            
            if(max < tmp) {
                answer = key;
                max = tmp;
                cnt = 1;
            } else if(max == tmp) {
                cnt++;
            }
        }
        
        if(cnt >= 2) return -1;
        return answer;
    }
}