class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0, cnt = 0; 
        
        for(int i=0;i<lottos.length;i++) {
            int num = lottos[i];
            if(num == 0) {
                zero++; continue;
            }
            
            for(int j=0;j<win_nums.length;j++) {
                if(num == win_nums[j]) {
                    cnt++; break;
                }
            }
        }
        
        int[] answer = {cnt+zero, cnt};
        for(int i=0;i<2;i++) {
            switch(answer[i]) {
                case 6 : answer[i] = 1; break;
                case 5 : answer[i] = 2; break;
                case 4 : answer[i] = 3; break;
                case 3 : answer[i] = 4; break;
                case 2 : answer[i] = 5; break;
                default : answer[i] = 6; break;
            }
        } 
    
        return answer;
    }
}