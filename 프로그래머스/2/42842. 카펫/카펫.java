class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for(int i=1;i<=(int)Math.sqrt(yellow);i++) {
            if(yellow % i != 0) continue;
            
            int row = i + 2; // 세로
            int col = (yellow / i) + 2; // 가로
            
            if((col * 2 + i * 2) == brown) {
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }
        
        return answer;
    }
}