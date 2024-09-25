import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++) {
            map.put(i, 0); // <순서, 횟수>
        }
        
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        
        int idx = 1;
        char last = words[0].charAt(0);
        for(String w : words) {
            if(w.charAt(0) != last || list.contains(w)) {
                answer[0] = idx;
                answer[1] = map.get(idx) + 1;
                break;
            }
            
            list.add(w);
            last = w.charAt(w.length()-1);
            map.put(idx, map.get(idx)+1);
            
            if(idx == n) idx = 1;
            else idx++;
        }
        
        return answer;
    }
}