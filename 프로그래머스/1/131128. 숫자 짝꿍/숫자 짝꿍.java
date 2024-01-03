import java.util.*;
class Solution {
    public String solution(String X, String Y) {

        int[] x = new int[10];
        int[] y = new int[10];
        
        for(int i=0;i<X.length();i++) {
            x[X.charAt(i) - 48]++;
        }
        
        for(int i=0;i<Y.length();i++) {
            y[Y.charAt(i) - 48]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=9;i>=0;i--) {
            while(x[i] >= 1 && y[i] >= 1) {
                x[i]--;
                y[i]--;
                
                sb.append(i);
            }
        }
        
        if(sb.length() == 0) return "-1";
        else if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}