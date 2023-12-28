import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        
        if(max >= set.size()) return set.size();
        else return max;
    }
}