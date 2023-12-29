class Solution {
    
    static int cnt = 0;
    static int sum = 0;
    
    public int solution(int[] nums) {
        
        dfs(0, 0, nums);
        return cnt;
    }
    
    static void dfs(int depth, int idx,int[] nums) {
        
        if(depth == 3) {
            for(int i=2;i<=(int)Math.sqrt(sum);i++) {
                if(sum % i == 0) return;
            }
            cnt++; return;
        }
        
        for(int i=idx;i<nums.length;i++) {
            sum += nums[i];
            dfs(depth+1, i+1, nums);
            sum -= nums[i];
        }
        return;
    }
}