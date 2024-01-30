class Solution {
    
    static boolean[] isVisit;
    
    public int solution(int k, int[][] dungeons) {
        
        isVisit = new boolean[dungeons.length];
        dfs(k, dungeons);
        
        return dfs(k, dungeons);
    }
    
    static int dfs(int k, int[][] dungeons) {
        
       int cnt = 0;
        
        for(int i=0;i<dungeons.length;i++) {
            if(!isVisit[i] && k >= dungeons[i][0]) {
                isVisit[i] = true;
                k -= dungeons[i][1];
                
                cnt = Math.max(dfs(k, dungeons), cnt);
                
                isVisit[i] = false;
                k += dungeons[i][1];
            }             
        }
        
        return Math.max(cnt(), cnt);
    }
    
    static int cnt() {
        int cnt = 0;
        
        for (boolean v : isVisit) {
            if (v) cnt++;
        }
        return cnt;
    }
    
}