class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for(int i=1;i<=(int)Math.sqrt(yellow);i++) {
            if(yellow % i != 0) continue;
            
            int heigh = i + 2;
            int width = yellow / i + 2;
            
            if((width * 2 + i * 2) == brown) {
                answer[0] = width;
                answer[1] = heigh;
                break;
            }
        }
        
        return answer;
    }
}