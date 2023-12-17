import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        
        int sum = 0;
        for(int i=0;i<=9;i++) {
            sum += i;
        }
        
        for(int num : numbers) {
            sum -= num;
        }
        
        return sum;
    }
}