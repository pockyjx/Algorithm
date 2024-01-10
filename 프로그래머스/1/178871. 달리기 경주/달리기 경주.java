import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
    
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<players.length;i++) {
            map.put(players[i], i);
        }
        
        for(String call : callings) {
            int ranking = map.get(call); // 추월한 선수의 원래 등수
            map.put(call, ranking-1); // 추월
            
            String front = players[ranking-1]; // 추월 당한 선수의 이름
            map.put(front, ranking); // 추월 당함
            
            players[ranking-1] = call;
            players[ranking] = front;
        }
        
        return players;
    }
}