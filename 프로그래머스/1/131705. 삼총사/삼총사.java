class Solution {
    
    static int cnt = 0;
    static int total = 0;
    
    public int solution(int[] number) {
        
        dfs(number, 0, 1);
        
        
        return cnt;
    }
    
    static void dfs(int[] number, int idx, int depth) {
        
        if(depth == 4) {
            if(total == 0) cnt++;
            return;
        }
        
        for(int i=idx;i<number.length;i++) {
            total += number[i];
            dfs(number, i+1, depth+1);
            total -= number[i];
        }
        return;
    }
}