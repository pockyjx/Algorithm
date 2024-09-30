class Solution {
    static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        return dfs(k, dungeons);
    }
    
    static int dfs(int k, int[][] dungeons) {
        int cnt = 0;
        for(int i=0;i<dungeons.length;i++) {
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                k -= dungeons[i][1];
                
                cnt = Math.max(dfs(k, dungeons), cnt);
                
                visited[i] = false;
                k += dungeons[i][1];
            }
        }
        
        return Math.max(cnt(), cnt);
    }
    
    static int cnt() {
        int cnt = 0;
        for(boolean v : visited) {
            if(v) cnt++;
        }
        return cnt;
    }
    
}