class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int max = health;
        int last = attacks[attacks.length-1][0];
        int idx = 0; int success = 0;
        
        for(int i=1;i<=last;i++) {
            
            if(i == attacks[idx][0]) { // 공격
                health -= attacks[idx][1];
                idx++; success = 0;
                
                if(health <= 0) {
                    health = -1; break;
                }
            }
            
            else { // 회복
                success++;
                health += bandage[1];
                
                if(success == bandage[0]) {
                    health += bandage[2];
                    success = 0;
                }
                
                if(health > max) health = max;
            }
        }
        
        return health;
    }
}