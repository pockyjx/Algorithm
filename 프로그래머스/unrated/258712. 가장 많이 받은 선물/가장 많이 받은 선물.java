import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        // <준 사람, <받은 사람, 개수>>
        Map<String, HashMap<String, Integer>> gift = new HashMap<>();
        Map<String, Integer> give = new HashMap<>();
        Map<String, Integer> take = new HashMap<>();
        Map<String, Integer> score = new HashMap<>();
        
        for(String s : friends) {
            gift.put(s, new HashMap<>());
            give.put(s, 0);
            take.put(s, 0);
            score.put(s, 0);
        }
        
        for(String s : gifts) {
            String from = s.split(" ")[0]; // 준 사람
            String to = s.split(" ")[1]; // 받은 사람
            
            give.put(from, give.get(from)+1);
            take.put(to, take.get(to)+1);
            
            Map<String, Integer> map = gift.get(from);
            map.put(to, map.getOrDefault(to, 0)+1);
        }
        
        for(String s : friends) {
            score.put(s, give.get(s)-take.get(s));
        }
        
        int[] answer = new int[friends.length];
        
        for(int i=0;i<friends.length-1;i++) {
            String a = friends[i];
            Map<String, Integer> mapA = gift.get(a);
            
            for(int j=i+1;j<friends.length;j++) {
                String b = friends[j];
                Map<String, Integer> mapB = gift.get(b);
                
                if(!mapA.containsKey(b)) {
                    if(mapB.containsKey(a)) answer[j]++;
                    else if(score.get(a) > score.get(b)) answer[i]++;
                    else if(score.get(a) < score.get(b)) answer[j]++;
                }
                
                else {
                    if(!mapB.containsKey(a)) answer[i]++;
                    else if(mapA.get(b) > mapB.get(a)) answer[i]++;
                    else if(mapA.get(b) < mapB.get(a)) answer[j]++;
                    else {
                        if(score.get(a) > score.get(b)) answer[i]++;
                        else if(score.get(a) < score.get(b)) answer[j]++;
                    }
                }
            }
        }
        
        return Arrays.stream(answer).max().getAsInt();
    }
}