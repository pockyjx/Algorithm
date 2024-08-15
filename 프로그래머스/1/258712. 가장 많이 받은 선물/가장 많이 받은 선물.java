import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Map<String, Integer>> gift = new HashMap<>(); // <준 사람, <받은 사람, 개수>>
        Map<String, Integer> score = new HashMap<>();
        
        for(String f : friends) {
            gift.put(f, new HashMap<>());
            score.put(f, 0);
        }
        
        for(String g : gifts) {
            String[] s = g.split(" ");
            String from = s[0]; // 준 사람
            String to = s[1]; // 받은 사람
            
            Map<String, Integer> map = gift.get(from);
            map.put(to, map.getOrDefault(to, 0) + 1);
            
            score.put(from, score.get(from) + 1);
            score.put(to, score.get(to) - 1);
        }
        
        int[] cnt = new int[friends.length];
        for(int i=0;i<friends.length;i++) {
            String f1 = friends[i];
            Map<String, Integer> m1 = gift.get(f1);
            
            for(int j=i+1;j<friends.length;j++) {
                String f2 = friends[j];
                Map<String, Integer> m2 = gift.get(f2);
                
                if(m1.containsKey(f2)) { // f1이 f2한테 준 경우
                    if(!m2.containsKey(f1)) cnt[i]++; // f2는 안줌 -> f1이 받음
                    else if(m1.get(f2) > m2.get(f1)) cnt[i]++; // 주고 받았는데 f1이 더 많이 줌
                    else if(m1.get(f2) < m2.get(f1)) cnt[j]++; // 주고 받았는데 f2가 더 많이 줌
                    else { // 둘 다 같은 개수로 줘서 선물 지수 큰 사람이 받음
                        if(score.get(f1) > score.get(f2)) cnt[i]++;
                        else if(score.get(f1) < score.get(f2)) cnt[j]++;
                    }
                }
                
                else { // f1이 f2한테 안 준 경우
                    if(m2.containsKey(f1)) cnt[j]++; // f2는 줌 -> f2가 받음
                    // 둘 다 안 줘서 선물 지수 큰 사람이 받음 
                    else if(score.get(f1) > score.get(f2)) cnt[i]++;
                    else if(score.get(f1) < score.get(f2)) cnt[j]++;
                }
            }
        }
        
        return Arrays.stream(cnt).max().getAsInt();
    }
}