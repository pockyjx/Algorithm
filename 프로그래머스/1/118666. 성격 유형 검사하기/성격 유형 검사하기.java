import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<survey.length;i++) {
            char type = ' ';
            int score = 0;
            
            switch(choices[i]) {
                case 1 : type = survey[i].charAt(0); score = 3; break;
                case 2 : type = survey[i].charAt(0); score = 2; break;
                case 3 : type = survey[i].charAt(0); score = 1; break;
                    
                case 4 : continue;
                    
                case 5 : type = survey[i].charAt(1); score = 1; break;
                case 6 : type = survey[i].charAt(1); score = 2; break;
                case 7 : type = survey[i].charAt(1); score = 3; break;
            }
            
            map.put(type, map.getOrDefault(type, 0) + score);
        }
        
        String[] compare = {"RT", "CF", "JM", "AN"};
        String answer = "";
        
        for(String s : compare) {
            char first = s.charAt(0);
            char second = s.charAt(1);
            
            if(!map.containsKey(first)) {
                map.put(first, 0);
            }
            
            if(!map.containsKey(second)) answer += first;
            else answer += (map.get(first) >= map.get(second)) ? first : second;
        }
        
        return answer;
    }
}