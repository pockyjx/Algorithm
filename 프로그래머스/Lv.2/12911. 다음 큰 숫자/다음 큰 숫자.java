class Solution {
    public int solution(int n) {
        
        String binary = Integer.toBinaryString(n);
        int cnt = binary.length() - binary.replace("1", "").length();
    
        while(true) {
            n++;
            
            String tmp = Integer.toBinaryString(n);
            int tmpCnt = tmp.length() - tmp.replace("1", "").length();
            
            if(tmpCnt == cnt) break;
        }
        
        return n;
    }
}