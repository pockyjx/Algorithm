import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // <회원, <신고한 사람들>> 
        Map<String, HashSet<String>> reportCnt = new HashMap<>();
        
        // <회원, 인덱스>
        Map<String, Integer> idx = new HashMap<>();
        
        for(int i=0;i<id_list.length;i++) {
            String id = id_list[i];
            
            // 회원 id와 해당 회원을 신고한 회원을 담을 HashSet 선언
            reportCnt.put(id, new HashSet<>());
            
            // 회원 id와 회원의 인덱스 (이후 사용)
            idx.put(id, i);
        }
        
        for(String s : report) {
            String[] split = s.split(" ");
            String from = split[0]; // 신고한 회원
            String to = split[1]; // 신고당한 회원
            
            // 신고당한 회원의 set에 신고한 회원 추가
            reportCnt.get(to).add(from);
        }
        
        int[] answer = new int[id_list.length];
        for(String key : id_list) {
            HashSet<String> set = reportCnt.get(key);
            
            if(set.size() >= k) {
                for(String id : set) {
                    answer[idx.get(id)]++;
                }
            }
        }
        
        return answer;
    }
}