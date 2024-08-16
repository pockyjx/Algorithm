import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        for(String t : terms) {
            String[] split = t.split(" ");
            map.put(split[0], Integer.parseInt(split[1]) * 28);
        }
        
        String[] tmp = today.split("\\.");
        int date = toDate(tmp[0], tmp[1], tmp[2]);
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<privacies.length;i++) {
            String[] split = privacies[i].split(" ");
            String type = split[1];
            
            tmp = split[0].split("\\.");
            int exp = toDate(tmp[0], tmp[1], tmp[2]) + map.get(type);
        
            if(date >= exp) list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);    
        }
        
        return answer;
    }
    
    static int toDate(String y, String m, String d) {
        return Integer.parseInt(y) * 12 * 28
            + Integer.parseInt(m) * 28
            + Integer.parseInt(d);
    }
    
}