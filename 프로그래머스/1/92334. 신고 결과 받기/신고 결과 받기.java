import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // <신고 당한 사람, <신고 한 사람 목록>>
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idx = new HashMap<>();
        
        for(int i=0;i<id_list.length;i++) {
            String id = id_list[i];
            
            map.put(id, new HashSet<>());
            idx.put(id, i);
        }
        
        for(String s : report) {
            String from = s.split(" ")[0]; // 신고한 사람
            String to = s.split(" ")[1]; // 신고 당한 사람
            
            Set<String> set = map.get(to);
            set.add(from);
        }
        
        int[] answer = new int[id_list.length];
        
        for(String id : id_list) {
            Set<String> set = map.get(id);
            
            if(set.size() >= k) {
                for(String s : set) {
                    answer[idx.get(s)]++;
                }
            }
        }
        
        return answer;
    }
}