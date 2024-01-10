import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        List<int[]> list = new ArrayList<>();
        int extIdx = findIdx(ext);
        
        for(int[] arr : data) {
            int[] result = compare(arr, extIdx, val_ext);
            if(result == null) continue;
            list.add(arr);
        }
        
        final int sortIdx = findIdx(sort_by);
        Collections.sort(list, (a1, a2) -> Integer.compare(a1[sortIdx], a2[sortIdx]));
        
        int[][] answer = new int[list.size()][4];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    static int findIdx(String s) {
        if(s.equals("code")) return 0;
        else if(s.equals("date")) return 1;
        else if(s.equals("maximum")) return 2;
        else return 3;
    }
    
    static int[] compare(int[] arr, int idx, int val) {
        return (arr[idx] < val) ? arr : null;
    }
    
}