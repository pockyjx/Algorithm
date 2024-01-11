import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int[] answer = new int[2];
        for(int i=0;i<park.length;i++) {
            int idx = park[i].indexOf("S");
            if(idx != -1) {
                answer[0] = i; answer[1] = idx;
                break;
            }
        }
        
        for(String s : routes) {
            String[] route = s.split(" ");
            String op = route[0];
            int n = Integer.parseInt(route[1]);
            
            int col = answer[0];
            int row = answer[1];
            
            for(int i=0;i<n;i++) {
                if(op.equals("W")) row--;
                else if(op.equals("S")) col++;
                else if(op.equals("E")) row++;
                else col--;
                
                if(col >= 0 && col < park.length &&
                  row >= 0 && row < park[0].length()) {
                    
                    if(park[col].charAt(row) == 'X') break;
                    if(i == n-1) {
                        answer[0] = col;
                        answer[1] = row;
                    }
                }
            } 
            
        }
        
        return answer;
    }
}