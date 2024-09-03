class Solution {
    public int solution(String skill, String[] skill_trees) {        
        int answer = 0;
        
        for(String s : skill_trees) {
            String tmp1 = "";
            
            for(int i=0;i<s.length();i++) {
                char ch = s.charAt(i);
                if(skill.contains(ch+"")) {
                    tmp1 += ch;
                }
            }
            
            String tmp2 = skill.substring(0, tmp1.length());
            if(tmp1.equals(tmp2)) answer++;
        }
        
        return answer;
    }
}