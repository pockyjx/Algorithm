import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++) {
            map.put(i+1, 0);
        }
        
        int idx = 1;
        char last = words[0].charAt(0);
        List<String> list = new ArrayList<>();
        
        for(String s : words) {
            if(s.charAt(0) != last || list.contains(s)) {
                answer[0] = idx;
                answer[1] = map.get(idx) + 1;
                break;
            }
            
            map.put(idx, map.get(idx)+1);
            last = s.charAt(s.length()-1);
            list.add(s);
            
            if(idx == n) idx = 1;
            else idx++;
        }
 
        return answer;
    }
}