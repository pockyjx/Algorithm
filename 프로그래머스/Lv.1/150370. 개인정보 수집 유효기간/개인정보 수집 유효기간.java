import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String, Integer> map = new HashMap<>();
        for(String s : terms) {
            String[] tmp = s.split(" ");
            map.put(tmp[0], Integer.parseInt(tmp[1]));
        }
        
        // 비교하기 쉽게 일수로 변환
        String[] tmp = today.split("\\.");
        int date = Integer.parseInt(tmp[0]) * 12 * 28 +
                    Integer.parseInt(tmp[1]) * 28 +
                    Integer.parseInt(tmp[2]);
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<privacies.length;i++) {
            String[] p = privacies[i].split(" ");
            String type = p[1];
            
            tmp = p[0].split("\\.");
            int expireDate = Integer.parseInt(tmp[0]) * 12 * 28 +
                            (Integer.parseInt(tmp[1]) + map.get(type)) * 28 +
                            Integer.parseInt(tmp[2]);
            
            if(date >= expireDate) {
                list.add(i+1);
            }
        }

        return list.stream().flatMapToInt(m -> IntStream.of(m)).toArray();
    }
    
}