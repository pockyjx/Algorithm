import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
        
        int tmp;
        for(int i=0;i<numbers.length;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                tmp = numbers[i] + numbers[j];
                set.add(tmp);
            }
        }
        
        int[] answer = new int[set.size()];
        int idx = 0;
        for(int i : set) {
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}