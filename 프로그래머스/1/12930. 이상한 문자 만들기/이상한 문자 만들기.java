import java.util.*;
class Solution {
    public String solution(String s) {
        
        s = s.toLowerCase();
        String[] word = s.split(" ", -1);

        for(int i=0;i<word.length;i++) {
            String[] str = word[i].split("");
            
            for(int j=0;j<str.length;j++) {
                if(j%2 == 0) str[j] = str[j].toUpperCase();
            }
            
            word[i] = String.join("", str);
        }
        
        return String.join(" ", word);
    }
}