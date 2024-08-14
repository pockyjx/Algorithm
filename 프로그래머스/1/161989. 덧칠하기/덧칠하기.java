class Solution {
    public int solution(int n, int m, int[] section) {
        int cnt = 1;
        int end = section[0] + m - 1;

        for(int start : section) {
            if(start <= end) continue;
            
            cnt++;
            end = start + m - 1;
        }
        
        return cnt;
    }
}