import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int answer = n - lost.length;
        
        // 여벌 체육복이 도난당한 경우
        for(int i=0;i<lost.length;i++) {
            for(int j=0;j<reserve.length;j++) {
                if(lost[i] == reserve[j]) {
                    answer++; // 가능
                    lost[i] = -1; reserve[j] = -1;
                    break;
                }
            }
        }
        
        // 여벌 체육복 빌려주는  경우
        for(int i=0;i<lost.length;i++) {
            for(int j=0;j<reserve.length;j++) {
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
                    answer++;
                    lost[i] = -1; reserve[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}