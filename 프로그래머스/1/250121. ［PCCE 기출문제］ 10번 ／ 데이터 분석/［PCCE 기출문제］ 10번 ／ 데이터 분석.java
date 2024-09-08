import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        int extIdx = findIdx(ext);
        
        for(int[] d : data) {
            if(d[extIdx] < val_ext) list.add(d);
        }
        
        int sortIdx = findIdx(sort_by);
        Collections.sort(list, (l1, l2) -> Integer.compare(l1[sortIdx], l2[sortIdx]));
        
        int[][] answer = new int[list.size()][4];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    static int findIdx(String ext) {
        if(ext.equals("code")) return 0;
        else if(ext.equals("date")) return 1;
        else if (ext.equals("maximum")) return 2;
        else return 3;
    }
}