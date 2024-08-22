import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[] x = new int[10];
        int[] y = new int[10];
        
        for(int i=0;i<X.length();i++) {
            x[X.charAt(i) - '0']++;
        }
        
        for(int i=0;i<Y.length();i++) {
            y[Y.charAt(i) - '0']++;
        }
        
        // String answer = ""; // 시간 초과..
        StringBuilder answer = new StringBuilder();
        for(int i=9;i>=0;i--) {
            while(x[i] > 0 && y[i] > 0) {
                //answer += i;
                answer.append(i);
                x[i]--; y[i]--;
            }
        }
            
        if(answer.length() == 0) return "-1";
        else if(answer.charAt(0) == '0') return "0";
        else return answer.toString();
    }
}