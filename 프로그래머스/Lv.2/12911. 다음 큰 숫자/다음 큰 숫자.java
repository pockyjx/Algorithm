class Solution {
    public int solution(int n) {
        
        // Integer.bitCount(n) : 2진수 n에서 1의 개수 반환
        int cnt = Integer.bitCount(n);
        while(Integer.bitCount(++n) != cnt) {}
        
        return n;
    }
}