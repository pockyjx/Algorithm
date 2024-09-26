import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] f1 = separate(s1);
                String[] f2 = separate(s2);
                
                // head끼리 비교하여 정렬 : 음수 - f2가 큼 / 양수 - f1이 큼 / 0 - 같음 
                int result = f1[0].compareTo(f2[0]);
                if(result == 0) {
                    int n1 = Integer.parseInt(f1[1]);
                    int n2 = Integer.parseInt(f2[1]);
                    
                    result = Integer.compare(n1, n2);
                }
                
                return result;
            }
        });
        
        return files;
    }
    
    static String[] separate(String file) {
        file = file.toLowerCase();
        String head = file.split("[0-9]")[0];
        String tmp = file.substring(head.length());
        
        String number = "";
        for(int i=0;i<tmp.length();i++) {
            char ch = tmp.charAt(i);
            if(!Character.isDigit(ch) || number.length() == 5) break;
            number += ch;
        }
        
        return new String[]{head, number};
    }
}