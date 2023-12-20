class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = gcd(Math.max(n, m), Math.min(n, m));
        answer[0] = gcd;
        answer[1] = (n/gcd) * (m/gcd) * gcd;
        
        return answer;
    }
    
    static int gcd(int x, int y) {
        int z = x % y;
        if(z == 0) return y;
        return gcd(y, z);
    }
}