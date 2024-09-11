import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        for(String k : keymap) {
            for(int i=0;i<k.length();i++) {
                char ch = k.charAt(i);
                map.put(ch, Math.min(map.getOrDefault(ch, i+1), i+1));
            }
        }
        
        int[] answer = new int[targets.length];
        for(int i=0;i<targets.length;i++) {
            String s = targets[i];
            
            for(int j=0;j<s.length();j++) {
                char ch = s.charAt(j);
                
                if(map.get(ch) == null) {
                    answer[i] = -1; break;
                }
                
                answer[i] += map.get(ch);
            }
        }
        
        return answer;
    }
}