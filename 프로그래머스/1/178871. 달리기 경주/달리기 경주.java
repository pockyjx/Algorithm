import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        for(int i=0;i<players.length;i++) {
            rank.put(players[i], i);
        }
        
        for(String call : callings) {
            int ranking = rank.get(call);
            rank.put(call, ranking-1); // 추월함
            
            String front = players[ranking-1]; // 원래 앞에 있던 선수
            rank.put(front, ranking); // 추월 당함
            
            players[ranking-1] = call;
            players[ranking] = front;
        }
        
        return players;
    }
}