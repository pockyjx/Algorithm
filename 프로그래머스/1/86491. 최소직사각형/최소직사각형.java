class Solution {
    
    public int solution(int[][] sizes) {

        int width, maxW = 0;
        int height, maxH = 0;
        
        for(int i=0;i<sizes.length;i++) {
            width = Math.max(sizes[i][0], sizes[i][1]);
            height = Math.min(sizes[i][0], sizes[i][1]);
            
            maxW = Math.max(maxW, width);
            maxH = Math.max(maxH, height);
        }
        
        
        return maxW * maxH;
    }
}