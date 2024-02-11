class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        int cnt = t * m; // 게임 횟수
        
        // Integer.toString(i, n) : 10진수 i ->  n진수 문자열 (영어는 소문자)
        while(sb.length() < cnt) {
            sb.append(Integer.toString(num++, n).toUpperCase());
        }
         
        String tmp = sb.substring(0, cnt);
        StringBuilder answer = new StringBuilder();
        for(int i=p-1;i<cnt;i+=m) {
            answer.append(tmp.charAt(i));
        }
        
        return answer.toString();
    }
}