import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for(int i=0;i<park.length;i++) {
            int idx = park[i].indexOf('S');
            if(idx != -1) {
                answer[0] = i;
                answer[1] = idx;
                break;
            }
        }
        
        for(int i=0;i<routes.length;i++) {
            String[] tmp = routes[i].split(" ");
            String op = tmp[0];
            int n = Integer.parseInt(tmp[1]);
            
            int col = answer[0];
            int row = answer[1];
            
            for(int j=0;j<n;j++) {
                if(op.equals("E")) row++;
                else if(op.equals("W")) row--;
                else if (op.equals("S")) col++;
                else col--;
                
                if(col < 0 || row < 0 || 
                   col >= park.length || row >= park[0].length() ||
                  park[col].charAt(row) == 'X') break;
                
                if(j == n-1) {
                    answer[0] = col;
                    answer[1] = row;
                }
            }
        }
        
        return answer;
    }
}