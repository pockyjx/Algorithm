import java.util.*;
class Solution {
    
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public int solution(int[][] maps) {
        
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] isVisit = new boolean[n][m];
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));
        isVisit[0][0] = true;
        
        while(!q.isEmpty()) {
            Node poll = q.poll();
            int px = poll.x; int py = poll.y;
            
            for(int i=0;i<4;i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(maps[nx][ny] == 1 && !isVisit[nx][ny]) {
                    q.offer(new Node(nx, ny));
                    maps[nx][ny] = maps[px][py] + 1;
                    isVisit[nx][ny] = true;
                }
            }
        }  
        
        return (maps[n-1][m-1] == 1) ? -1 : maps[n-1][m-1];
    }
}