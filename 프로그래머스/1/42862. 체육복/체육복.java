import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복 도난 : 가능
        for(int i=0;i<reserve.length;i++) {
            for(int j=0;j<lost.length;j++) {
                if(reserve[i] == lost[j]) {
                    answer++;
                    reserve[i] = -1;
                    lost[j] = -1;
                    break;
                } 
            }
        }
        
        // 체육복 빌려주기
        for(int i=0;i<lost.length;i++) {
            for(int j=0;j<reserve.length;j++) {
                if(lost[i] -1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    lost[i] = -1; 
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}