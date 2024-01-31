import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        
        str1 = str1.toLowerCase().replaceAll("[^a-z]", " ");
        List<String> s1 = set(str1);
        
        str2 = str2.toLowerCase().replaceAll("[^a-z]", " ");
        List<String> s2 = set(str2);
        
        Collections.sort(s1);
        Collections.sort(s2);
        
        List<String> union = new ArrayList<>(); // 합
        List<String> inter = new ArrayList<>(); // 교
        
        for(String s : s1) {
            if(s2.remove(s)) union.add(s);
            inter.add(s);
        }
        
        inter.addAll(s2);
        if(inter.size() == 0) return 65536;
        
        return (int)(((double)union.size() / inter.size()) * 65536);
    }
    
    static List<String> set(String str) {
        
        List<String> list = new ArrayList<>();  
        
        for(int i=0;i<str.length()-1;i++) {
            String tmp = str.substring(i, i+2);
            if(!tmp.contains(" ")) list.add(tmp);
        }
        
        return list;
    }
}