class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0]; int y1 = dots[0][1];
        int x2 = dots[1][0]; int y2 = dots[1][1];
        int x3 = dots[2][0]; int y3 = dots[2][1];
        int x4 = dots[3][0]; int y4 = dots[3][1];
        
        // 기울기 : y차 / x차
        double t1 = (double) (y2 - y1) / (x2 - x1); // 1-2
        double t2 = (double) (y4 - y3) / (x4 - x3); // 3-4
        if(t1 == t2) return 1;
        
        t1 = (double) (y3 - y1) / (x3 - x1); // 1-3
        t2 = (double) (y4 - y2) / (x4 - x2); // 2-4
        if(t1 == t2) return 1;
        
        t1 = (double) (y4 - y1) / (x4 - x1); // 1-4
        t2 = (double) (y3 - y2) / (x3 - x2); // 2-3
        if(t1 == t2) return 1;
        
        return 0;
    }
}