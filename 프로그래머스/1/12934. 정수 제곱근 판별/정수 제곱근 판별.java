class Solution {
    public long solution(long n) {
        
        long tmp = (long)Math.sqrt(n);
        if((long)Math.pow(tmp, 2) == n) return (long)Math.pow(tmp+1, 2);
        return -1;
    }
}