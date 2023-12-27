import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] tmp = new String[strings.length];
        for(int i=0;i<tmp.length;i++) {
            tmp[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(tmp);
        
        String[] answer = new String[strings.length];
        for(int i=0;i<tmp.length;i++) {
            answer[i] = tmp[i].substring(1, tmp[i].length());
        }
        
        return answer;
    }
}