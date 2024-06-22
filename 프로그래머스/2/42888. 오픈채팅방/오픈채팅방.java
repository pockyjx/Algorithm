import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        
        for(int i=0;i<record.length;i++) {
            String[] tmp = record[i].split(" ");
            
            if(!tmp[0].equals("Leave")) {
                map.put(tmp[1], tmp[2]);
            }
        }
        
        List<String> list = new ArrayList<>();
        for(int i=0;i<record.length;i++) {
            String[] tmp = record[i].split(" ");
            String action = tmp[0];
            String nickname = map.get(tmp[1]);
            
            if(action.equals("Enter")) {
                list.add(nickname + "님이 들어왔습니다.");
            } else if(action.equals("Leave")) {
                list.add(nickname + "님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}