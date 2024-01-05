import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(String s : keymap) {
            for(int i=0;i<s.length();i++) {
                char ch = s.charAt(i);
                map.put(ch, Math.min(i+1, map.getOrDefault(ch, i+1)));
            }
        }        
        
        int[] answer = new int[targets.length];
        for(int i=0;i<targets.length;i++) {
            String s = targets[i];
            
            for(int j=0;j<s.length();j++) {
                if(map.containsKey(s.charAt(j))) {
                    answer[i] += map.get(s.charAt(j));
                } else {
                    answer[i] = -1; break;
                }
            }
        }
            
            
        return answer;
    }
}