class Solution {
    public boolean solution(String s) {
        
        if(s.length() == 4 || s.length() == 6) {
            char[] arr = s.toCharArray();
            
            for(char ch : arr) {
                if(ch < 48 || ch > 57) return false;
            }
            
            return true;   
        }
        
        else return false;
    }
}