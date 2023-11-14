class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1;i<food.length;i++) {
            int n = food[i] / 2;
            
            for(int j=0;j<n;j++) {
                sb.append(i);
            }
        }

        String answer = sb.toString();
        return answer + "0" + sb.reverse().toString();
    }
}