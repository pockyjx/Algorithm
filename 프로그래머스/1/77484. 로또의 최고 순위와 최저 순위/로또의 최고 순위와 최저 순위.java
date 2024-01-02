class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int cnt = 0; // 정확한 수 중 일치한 개수
        int zero = 0; // 0의 개수
        
        for(int i=0;i<lottos.length;i++) {
            int tmp = lottos[i];
            if(tmp == 0) {
                zero++; continue;
            }
            
            for(int j=0;j<win_nums.length;j++) {
                if(tmp == win_nums[j]) {
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
                default : answer[i] = 6;
            }
        }
        return answer;
    }
}