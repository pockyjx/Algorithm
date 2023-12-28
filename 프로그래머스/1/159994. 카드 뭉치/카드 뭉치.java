class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int idx1 = 0; int idx2 = 0;
        
        for(int i=0;i<goal.length;i++) {
            if(cards1[idx1].equals(goal[i])) {
                if(idx1 < cards1.length-1) idx1++;
            } else if(cards2[idx2].equals(goal[i])) {
                if(idx2 < cards2.length-1) idx2++;
            }
            else return "No";
        }
        
        return "Yes";
    }
}