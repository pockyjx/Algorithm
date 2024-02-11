import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> record = new HashMap<>();
        Map<String, Integer> fee = new TreeMap<>();
        
        for(int i=0;i<records.length;i++) {
            String[] tmp = records[i].split(" ");
            int time = getTime(tmp[0]);
            String num = tmp[1];
            
            if(tmp[2].equals("IN")) {
                record.put(num, time);
            } else {
                int start = record.get(num);
                fee.put(num, fee.getOrDefault(num, 0) + (time - record.get(num)));
                record.remove(num);
            }
        }
        
        for(String s : record.keySet()) {
            fee.put(s, fee.getOrDefault(s, 0) + (getTime("23:59") - record.get(s))); 
        }
        
        int basicMin = fees[0]; int basicCost = fees[1];
        int unitMin = fees[2]; int unitCost = fees[3];
        
        int[] answer = new int[fee.keySet().size()];
        int idx = 0;
        for(int i : fee.values()) {
            answer[idx] = basicCost;
            if(i > basicMin) {
                answer[idx] += (Math.ceil((i - basicMin) / (double)unitMin)) * unitCost;
            }
            idx++;
        }

        return answer;
    }
    
    static int getTime(String t) {
        String[] time = t.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }
}