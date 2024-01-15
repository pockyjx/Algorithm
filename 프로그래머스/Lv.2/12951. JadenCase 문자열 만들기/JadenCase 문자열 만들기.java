class Solution {
    public String solution(String s) {
        
        String[] word = s.split(" ", -1);
        
        
        for(int i=0;i<word.length;i++) {
            String w = word[i];
            if(w.isEmpty()) continue;
            
            char first = Character.toUpperCase(w.charAt(0));
            String tmp = w.substring(1, w.length()).toLowerCase();
            
            word[i] = first + tmp;
        }
        
        return String.join(" ", word);
    }
}