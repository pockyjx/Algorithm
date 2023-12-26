class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i=0;i<answer.length;i++) {
            int idx = 10000;
            for(int j=0;j<i;j++) {
                if(s.charAt(j) == (s.charAt(i))) 
                    idx = Math.min(idx, i-j);
            }
            answer[i] = (idx != 10000)? idx : -1;
        }
        return answer;
    }
}