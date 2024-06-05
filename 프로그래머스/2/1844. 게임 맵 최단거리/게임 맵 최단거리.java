import java.util.*;

class Solution {
    
    static int n, m;
    static boolean[][] isVisit;
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        
        isVisit = new boolean[n][m];
        
        return bfs(0, 0, maps);
    }
    
    static int bfs(int x, int y, int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        isVisit[x][y] = true;
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        while(!q.isEmpty()) {
            int[] p = q.poll();
            int px = p[0]; int py = p[1];
            
            for(int i=0;i<4;i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(maps[nx][ny] == 1 && !isVisit[nx][ny]) {
                    q.offer(new int[] {nx, ny});
                    maps[nx][ny] = maps[px][py] + 1;
                    isVisit[nx][ny] = true;
                }
            }
        }
        return !isVisit[n-1][m-1] ? -1 : maps[n-1][m-1];
    }
}