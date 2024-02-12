class Solution {
    
    static boolean[][][][] isVisit = new boolean[11][11][11][11];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
    public int solution(String dirs) {
        int answer = 0;
        int x = 5; int y = 5;
        
        int idx = 0;
        for(String s : dirs.split("")) {
            switch(s) {
                case "U" : idx = 2; break;
                case "D" : idx = 3; break;
                case "L" : idx = 1; break;
                case "R" : idx = 0; break;
            }
            
            int mx = x + dx[idx];
            int my = y + dy[idx];
            
            if(mx < 0 || my < 0 || mx > 10 || my > 10) continue;
            if(!isVisit[x][y][mx][my] && !isVisit[mx][my][x][y]) {
                isVisit[x][y][mx][my] = true;
                isVisit[mx][my][x][y] = true;
                answer++;
            }
            
            x = mx; y = my;
        }
        
        return answer;
    }
}