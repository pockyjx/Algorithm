class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] str = s.toCharArray();
        int cnt = 0;
        
        for(int i=0;i<str.length;i++) {
            if(str[i] == 'p' || str[i] == 'P') cnt++;
            else if(str[i] == 'y' || str[i] == 'Y') cnt--;
        }

        return (cnt == 0) ? true : false;
    }
}