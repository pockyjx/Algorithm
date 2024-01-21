class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        for(int i=0;i<arr.length;i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }
    
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    static int gcd(int a, int b) {
        int c = a % b;
        if(c == 0 ) return b;
        return gcd(b, c);
    }
    
}