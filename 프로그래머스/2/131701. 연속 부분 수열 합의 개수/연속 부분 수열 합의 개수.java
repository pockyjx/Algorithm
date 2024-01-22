import java.util.*;
class Solution {
    public int solution(int[] elements) {
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<elements.length;i++) {
            for(int j=1;j<=elements.length;j++) {
                set.add(cal(i, j, elements));
            }
        }
        
        return set.size();
    }
    
    static int cal(int idx, int len, int[] elements) {
        int sum = elements[idx];
        int arrLen = elements.length;
        
        for(int i=1;i<len;i++) {
            int tmp = (idx + i >= arrLen) ? (idx + i) % arrLen : idx + i;
            sum += elements[tmp];
        }
        
        return sum;
    }
    
}