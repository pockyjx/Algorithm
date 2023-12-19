import java.util.*;
class Solution {
    public String solution(String s) {
        
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(String str : arr) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}