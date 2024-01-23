import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        int answer = 0;
        
        for(int i=0;i<discount.length-9;i++) {
            int j = 0;
            for(j=0;j<want.length;j++) {
                int check = 0;
                for(int k=i;k<i+10;k++) {
                    if(want[j].equals(discount[k])) check++;
                }
                if(check < number[j]) break;
            }
            if(want.length == j) answer++;
        }
        
        return answer;
    }
}