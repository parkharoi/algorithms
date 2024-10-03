import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }
        
        int maxCount = 0;
        boolean isMultiple = false;
        
        for(int key : countMap.keySet()) {
            int count = countMap.get(key);
            
            if(count > maxCount) {
                maxCount = count;
                answer = key;
                isMultiple = false;
            }else if (count == maxCount) {
                isMultiple = true;
            }
        }
        
        if (isMultiple) {
            return -1;
        }
        
        return answer;
    }
}