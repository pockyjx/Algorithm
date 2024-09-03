class Solution {
    public int solution(int a, int b) {
        int gcd = eucd(Math.max(a, b), Math.min(a, b));
        b /= gcd;
        
        while(b % 2 == 0 || b % 5 == 0) {
            if(b % 2 == 0) b /= 2;
            else if(b % 5 == 0) b /= 5;
        }
        
        return b == 1 ? 1 : 2;
    }
    
    static int eucd(int x, int y) { // 최대공약수
        int z = x % y;
        
        if(z == 0) return y;
        return eucd(y, z);
    }
}