import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for(int i=0;i<type.length;i++) {
            map.put(type[i], 0);
        }
        
        for(int i=0;i<survey.length;i++) {
            int choice = choices[i];
            
            if(choice < 4) {
                char ch = survey[i].charAt(0);
                map.put(ch, map.get(ch) + (4 - choice));
            } 
            
            else if (choice > 4) {
                char ch = survey[i].charAt(1);
                map.put(ch, map.get(ch) + (choice - 4));
            }
        }
        
        String answer = "";
        String[] mbti = {"RT", "CF", "JM", "AN"};
        
        for(int i=0;i<mbti.length;i++) {
            char first = mbti[i].charAt(0);
            char second = mbti[i].charAt(1);
            
            if(map.get(first) >= map.get(second)) {
                answer += first;
            } else {
                answer += second;
            }
        }
        
        return answer;
    }
}