class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10; // *
        int right = 12; // #
        
        for(int n : numbers) {
            if(n == 1 || n == 4 || n == 7) {
                left = n;
                answer.append("L");
            }
            
            else if(n == 3 || n == 6 || n == 9) {
                right = n;
                answer.append("R");
            }
            
            else {
                if(n == 0) n = 11;
                
                int ld = (Math.abs(n-left) / 3) + (Math.abs(n-left) % 3);
                int rd = (Math.abs(n-right) / 3) + (Math.abs(n-right) % 3);
                
                if(ld > rd) {
                    right = n;
                    answer.append("R");
                }
                
                else if(ld < rd) {
                    left = n;
                    answer.append("L");
                }
                
                else {
                    if(hand.equals("right")) {
                        right = n;
                        answer.append("R");
                    } else {
                        left = n;
                        answer.append("L");
                    }
                }
            }
        }

        return answer.toString();
    }    
}