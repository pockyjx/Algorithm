class Solution {
    public int[] solution(int n, long left, long right) {
        
        int[] answer = new int[(int)(right - left) + 1];
        for(int i=0;i<answer.length;i++) {
            int col = (int)(left/n + 1);
            int row = (int)(left%n + 1);
            
            answer[i] = Math.max(col, row);
            left++;
        }

        return answer;
    }
}