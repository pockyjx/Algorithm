class Solution {
    public int solution(String[] babbling) {
        String[] baby = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i=0;i<babbling.length;i++) {
            for(int j=0;j<baby.length;j++) {
                
                if(!babbling[i].contains("ayaaya") &&
                  !babbling[i].contains("yeye") && 
                  !babbling[i].contains("woowoo") && 
                  !babbling[i].contains("mama")) {
                    
                    babbling[i] = babbling[i].replace(baby[j], " ");
                }
            } 
            if(babbling[i].replace(" ", "").equals("")) answer++;
        }
        
        return answer;
    }
}