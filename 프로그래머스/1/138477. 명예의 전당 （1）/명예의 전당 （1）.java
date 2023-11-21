import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
     
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        if(k <= score.length) {
            for(int i=0;i<k;i++) { // 1일 ~ k일
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            }   

            for(int i=k;i<score.length;i++) { // k일 이후

                if(score[i] > list.get(0)) {
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                    answer[i] = list.get(0);

                } else {
                    answer[i] = list.get(0);
                }
            }
        } else { // k > score.length
            for(int i=0;i<score.length;i++) {
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            }
        }
        
        return answer;
    }
}