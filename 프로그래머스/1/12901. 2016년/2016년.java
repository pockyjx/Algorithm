class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int total = 0;
        for(int i=0; i<a-1;i++) {
            total += date[i];
        }
        total += b - 1;
    
        return day[total % 7];
    }
}