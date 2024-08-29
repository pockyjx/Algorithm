import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<moves.length;i++) {
            int idx = moves[i]-1;
            int tmp = 0;
            
            for(int j=0;j<board.length;j++) {
                if(board[j][idx] != 0) {
                    tmp = board[j][idx];
                    board[j][idx] = 0;
                    break;
                }
            }
            
            if(tmp == 0) continue;
            
            if(s.empty() || s.peek() != tmp) {
                s.push(tmp);
            } else {
                s.pop();
                answer += 2;
            }
        }
        
        return answer;
    }
}