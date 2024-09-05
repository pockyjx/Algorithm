class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++) {
            String bin1 = toBinary(arr1[i], n);
            String bin2 = toBinary(arr2[i], n);
            
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++) {
                if(bin1.charAt(j) == '1' || bin2.charAt(j) == '1') sb.append("#");
                else sb.append(" ");
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
    
    static String toBinary(int num, int len) {
        String bin = Integer.toBinaryString(num);
        return String.format("%"+len+"s", bin).replace(' ', '0');
    }
}