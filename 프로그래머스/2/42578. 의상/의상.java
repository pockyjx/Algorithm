import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<clothes.length;i++) {
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 0)+1);
        }
        
        List<Integer> cnt = new ArrayList<>(map.values());
        int answer = 1;
        for(int i : cnt) {
            answer *= (i + 1);
        }
        
        return answer - 1;
    }
}