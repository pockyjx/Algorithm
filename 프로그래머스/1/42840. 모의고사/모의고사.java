import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        
        int[] cnt = new int[3];
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0;i<answers.length;i++) {
            if(answers[i] == person1[i%5]) cnt[0]++;
            if(answers[i] == person2[i%8]) cnt[1]++;
            if(answers[i] == person3[i%10]) cnt[2]++;
        }
        
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<cnt.length;i++) {
            if(cnt[i] == max) answer.add(i+1);
        }

        return answer;
    }
}