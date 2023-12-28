class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++) {
            String bin1 = toBinary(arr1[i], n);
            String bin2 = toBinary(arr2[i], n);
            
            String tmp = "";
            for(int j=0;j<n;j++) {
                if(bin1.charAt(j) == '1' || bin2.charAt(j) == '1') {
                    tmp += "#";
                } else {
                    tmp += " ";
                }
            }
            answer[i] = tmp;
        }

        return answer;
    }
    
    static String toBinary(int num, int len) {
        String binary = Integer.toBinaryString(num);
        return String.format("%"+len+"s", binary).replace(' ', '0');
    }
}