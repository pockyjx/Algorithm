import java.util.*;
class Solution {
    public String solution(String s) {
        
        String[] split = s.split(" ");
        int[] n = new int[split.length];
        
        for(int i=0;i<n.length;i++) {
            n[i] = Integer.parseInt(split[i]);
        }
        
        Arrays.sort(n);
        
        return n[0] + " " + n[n.length-1];
    }
}