import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = 0;
        
        for(int i=0;i<dartResult.length();i++) {
            char ch = dartResult.charAt(i);
            
            // 점수
            if(Character.isDigit(ch)) {
                if(ch == '1' && dartResult.charAt(i+1) == '0') {
                    score[idx++] = 10; i++;
                } else {
                    score[idx++] = ch - '0';
                }
            }
            
            // 보너스 & 옵션
            switch(ch) {
                case 'D' : 
                    score[idx-1] = (int) Math.pow(score[idx-1], 2); break;
                    
                case 'T' : 
                    score[idx-1] = (int) Math.pow(score[idx-1], 3); break;
                    
                case '*' : 
                    if(idx - 2 >= 0) score[idx-2] *= 2;
                    score[idx-1] *= 2; 
                    break;
                    
                case '#' :
                    score[idx-1] *= -1;
            }
        }
        
        int total = 0;
        for(int i=0;i<3;i++) {
            total += score[i];
        }
        
        return total;
    }
}