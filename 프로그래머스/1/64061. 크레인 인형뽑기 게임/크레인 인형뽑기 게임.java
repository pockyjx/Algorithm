import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        
        int n = board.length;
        int[] cnt = new int[n];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(board[i][j] != 0) cnt[j]++;
            }
        }
        
        Stack<Integer> s = new Stack<>();
        int answer = 0;
        
        for(int i=0;i<moves.length;i++) {
            int idx = moves[i] - 1;            
            if(cnt[idx] <= 0) continue;
            
            int crane = board[n-cnt[idx]][idx];
            
            if(s.empty() || s.peek() != crane) s.push(crane);
            else {
                s.pop(); answer += 2;
            }

            cnt[idx]--;
        }
        return answer;
    }
}