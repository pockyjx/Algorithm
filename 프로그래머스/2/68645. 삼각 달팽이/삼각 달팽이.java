import java.util.*;
class Solution {
    public int[] solution(int n) {
        /*
        1
        2 9
        3 10 8
        4 5 6 7
        */
        int[][] tmp = new int[n][n];
        
        int x = -1, y = 0, z = 1;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(i % 3 == 0) { // 아래
                    x++;
                }
                else if(i % 3 == 1) { // 오른쪽
                    y++;
                }
                else { // 대각선 위
                    x--; y--;
                }
                
                tmp[x][y] = z++;
            }
        }
        
        int idx = 0;
        int[] answer = new int[(n*(n+1))/2];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(tmp[i][j] == 0) break;
                answer[idx++] = tmp[i][j];
            }
        }
        
        return answer;
    }
}