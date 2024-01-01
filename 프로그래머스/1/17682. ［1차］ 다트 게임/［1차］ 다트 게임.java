class Solution {
    public int solution(String dartResult) {

        int[] score = new int[3]; // 점수
        char[] bonus = new char[3]; // 보너스
        char[] option = new char[3]; // 옵션
        
        int idx = 0;
        for(int i=0;i<3;i++) {
            score[i] = dartResult.charAt(idx++) - 48;
            if(dartResult.charAt(idx) == '0') {
                score[i] = 10; idx++;
            }
            
            bonus[i] = dartResult.charAt(idx++);
            
            if(idx < dartResult.length() && dartResult.charAt(idx) == '*') {
                option[i] = '*'; idx++;
            } else if(idx < dartResult.length() && dartResult.charAt(idx) == '#') {
                option[i] = '#'; idx++; 
            }
        }
    
        int answer = 0;
        for(int i=0;i<3;i++) {
            
            System.out.print(score[i] + " ");
            
            switch(bonus[i]) {
                case 'D' : score[i] *= score[i]; break;
                case 'T' : score[i] *= score[i] * score[i]; break;
            }
            
            System.out.print(bonus[i] + " " + score[i] + " " + option[i] + " ");
            
            if(option[i] == '*') {
                score[i] *= 2;
                answer += score[i];
                
                if(i - 1 >= 0) answer += score[i-1];
            } 
            
            else if(option[i] == '#') {
                score[i] *= -1;
                answer += score[i];
            } 
            
            else {
                answer += score[i];
            } 
        }
        
        return answer;
    }
}