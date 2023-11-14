class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1;i<food.length;i++) {
            int n = food[i] / 2;
            sb.append(String.valueOf(i).repeat(n));
        }

        String answer = sb.toString();
        return answer + "0" + sb.reverse().toString();
    }
}