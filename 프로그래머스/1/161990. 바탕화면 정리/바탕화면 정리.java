class Solution {
    public int[] solution(String[] wallpaper) {
        
        int[] answer = {50, 50, -1, -1};
        
        for(int i=0;i<wallpaper.length;i++) {
            String s = wallpaper[i];
            
            if(s.contains("#")) {
                answer[0] = Math.min(answer[0], i);
                answer[2] = Math.max(answer[2], i+1);
            }
            
                            
            for(int j=0;j<s.length();j++) {
                if(s.charAt(j) == '#') {
                    answer[1] = Math.min(answer[1], j);
                    answer[3] = Math.max(answer[3], j+1);
                }
            }
            
            
        }
        
        
        return answer;
    }
}