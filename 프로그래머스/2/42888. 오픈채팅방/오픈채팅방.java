import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<record.length;i++) {
            String[] split = record[i].split(" ");
            
            if(!split[0].equals("Leave")) {
                String id = split[1];
                String nickname = split[2];
                map.put(id, nickname);
            }
        }
        
        List<String> list = new ArrayList<>();
        for(int i=0;i<record.length;i++) {
            String[] split = record[i].split(" ");
            String action = split[0];
            String nickname = map.get(split[1]);
            
            if(action.equals("Enter")) {
                list.add(nickname + "님이 들어왔습니다.");
            } else if(action.equals("Leave")) {
                list.add(nickname + "님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[list.size()];
        int idx = 0;
        for(String s : list) {
            answer[idx++] = s;
        }
        
        return answer;
    }
}