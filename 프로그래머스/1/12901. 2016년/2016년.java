class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int total = 0;
        for(int i=1; i<a;i++) {
            switch(i) {
                case 1 :
                case 3 :
                case 5 : 
                case 7 :
                case 8 :
                case 10 : 
                case 12 : total += 31; break;
                
                case 4 :
                case 6 : 
                case 9 : 
                case 11 : total += 30; break;
                    
                default : total += 29;
            }
        }
        total += b - 1;
    
        return day[total % 7];
    }
}