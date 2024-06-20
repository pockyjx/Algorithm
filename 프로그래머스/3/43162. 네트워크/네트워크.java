import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] isVisit = new boolean[n];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(computers[i][j] == 1 && !isVisit[i]) {
                    dfs(computers, isVisit, i, n);
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    static void dfs(int[][] computers, boolean[] isVisit, int s, int n) {
        isVisit[s] = true;
        for(int i=0;i<n;i++) {
            if(computers[s][i] == 1 && !isVisit[i]) {
                dfs(computers, isVisit, i, n);
            }
        }
    }
    
}