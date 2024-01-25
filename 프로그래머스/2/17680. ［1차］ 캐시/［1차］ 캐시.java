import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;
        
        int answer = 0;
        List<String> cache = new ArrayList<>();
        
        for(int i=0;i<cities.length;i++) {
            String city = cities[i].toLowerCase();
            
            if(cache.size() < cacheSize) {
                if(cache.contains(city)) {
                    cache.remove(city);
                    cache.add(city);
                    answer += 1;
                } 
                
                else {
                    cache.add(city);
                    answer += 5;
                }  
            }
            
            else if(cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer += 1;
            }
            
            else {
                cache.remove(0);
                cache.add(city);
                answer += 5;
            }
        }
        
        return answer;
    }
}