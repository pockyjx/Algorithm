import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        String[] tmp = s.substring(2, s.length()-2)
                        .replace("},{", " ")
                        .split(" ");
        
        Arrays.sort(tmp, (a, b) -> Integer.compare(a.length(), b.length()));
        
        
        List<Integer> answer = new ArrayList<>();
        for(String t : tmp) {
            String[] arr = t.split(",");
            
            for(String a : arr) {
                int i = Integer.parseInt(a);
                if(!answer.contains(i)) answer.add(i);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}