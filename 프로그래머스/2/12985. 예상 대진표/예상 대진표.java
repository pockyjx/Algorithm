class Solution {
    public int solution(int n, int a, int b) {
        
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int answer = 0;
        while(true) {
            answer++;
            
            if((min % 2 == 1) && min + 1 == max) break;
            
            max = nextNum(max);
            min = nextNum(min);
        }

        return answer;
    }
    
    static int nextNum(int n) {
        if(n % 2 == 0) return n / 2;
        else return n / 2 + 1;
    }
}