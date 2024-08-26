class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50, 50, -1, -1};
        
        for(int i=0;i<wallpaper.length;i++) {
            String w = wallpaper[i];
            
            for(int j=0;j<w.length();j++) {
                if(w.charAt(j) == '#') {
                    answer[0] = Math.min(i, answer[0]);
                    answer[1] = Math.min(j, answer[1]);
                    
                    answer[2] = Math.max(i+1, answer[2]);
                    answer[3] = Math.max(j+1, answer[3]);
                }
            }
        }
        
        return answer;
    }
}