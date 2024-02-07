class Solution {
    public int solution(int n, int k) {     
        
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % k);
            n /= k;
        }
        
        String[] arr = sb.reverse().toString().split("0");
        int answer = 0;
        for(String s : arr) {
            if(s.equals("1") || s.isBlank()) continue;
            
            long tmp = Long.parseLong(s);
            boolean isPrime = true;
            for(int i=2;i<=(long)Math.sqrt(tmp);i++) {
                if(tmp % i == 0) {
                    isPrime = false; break;
                }
            }
            if(isPrime) answer++;
        }
        return answer;
    }
}