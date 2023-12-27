import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int[] tmp;
        for(int i=0;i<commands.length;i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            
            tmp = new int[end-start+1];
            int idx = 0;
            for(int j=start;j<=end;j++) {
                tmp[idx] = array[j];
                idx++;
            }
            
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2]-1];
        }
        
        return answer;
    }
}