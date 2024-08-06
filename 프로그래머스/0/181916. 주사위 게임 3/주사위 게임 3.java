import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        
        if(arr[0] == arr[3]) { // 모두 같음
            return 1111 * arr[0];
            
        } else if(arr[0] == arr[2]) { // 1 ~ 3번째 같고, 4번째 다름
           return (int) Math.pow((10 * arr[0] + arr[3]), 2);
            
        } else if(arr[1] == arr[3]) { // 2 ~ 4번째 같고, 1번째 다름
            return (int) Math.pow((10 * arr[1] + arr[0]), 2);
            
        } else if(arr[0] == arr[1] && arr[2] == arr[3]) { // 2개씩 같음
            return (arr[0] + arr[2]) * (arr[2] - arr[0]);
            
        } else if(arr[0] == arr[1]) { // 1, 2번째 같고 3, 4번째는 다름
            return arr[2] * arr[3];
            
        } else if(arr[1] == arr[2]) { // 2, 3번째 같고 1, 4번째는 다름
            return arr[0] * arr[3];
            
        } else if(arr[2] == arr[3]) { // 3, 4번째 같고 1, 2번째는 다름
            return arr[0] * arr[1];
            
        } else {
            return arr[0];
        }
    }
}