import java.util.*;
class Solution {
    public int[] solution(String msg) {
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<26;i++) {
            map.put(String.valueOf((char)('A'+i)), i+1);
        }
        
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        while(idx < msg.length()) {
            String s = "";
            
            while(idx < msg.length()) {
                if(!map.containsKey(s + msg.charAt(idx))) break;
                else s += msg.charAt(idx++);  
            }
            
            list.add(map.get(s));
            if(idx < msg.length()) map.put(s + msg.charAt(idx), map.size()+1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}