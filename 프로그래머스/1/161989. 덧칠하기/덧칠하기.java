class Solution {
    public int solution(int n, int m, int[] section) {
        
        int cnt = 0;
        int end = 0;
        
        for(int start : section) {
            if(start > end) {
                cnt++;
                end = start + m - 1;
            }
        }
        
        return cnt;
    }
}