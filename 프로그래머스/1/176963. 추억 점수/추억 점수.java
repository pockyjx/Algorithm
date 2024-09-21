import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<name.length;i++) {
            map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for(int i=0;i<photo.length;i++) {
            for(int j=0;j<photo[i].length;j++) {
                String s = photo[i][j];
                if(map.containsKey(s)) answer[i] += map.get(s);
            }
        }
        
        return answer;
    }
}