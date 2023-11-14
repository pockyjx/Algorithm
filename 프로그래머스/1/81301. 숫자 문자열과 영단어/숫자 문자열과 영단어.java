class Solution {
    public int solution(String s) {
        
        String[] num 
            = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0;i<10;i++) {
            if(s.contains(num[i])) {
                s = s.replace(num[i], String.valueOf(i));
            }
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}