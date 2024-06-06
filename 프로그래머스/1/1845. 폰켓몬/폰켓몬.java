import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        
        int max = nums.length / 2;
        if(set.size() < max) return set.size();
        else return max;
    }
}