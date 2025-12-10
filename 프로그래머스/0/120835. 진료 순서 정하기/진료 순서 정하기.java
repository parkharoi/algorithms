import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortedEmergency = Arrays.copyOf(emergency, emergency.length);
        
        int len = emergency.length; 
        int [] answer = new int[len];
        
        Arrays.sort(sortedEmergency);
        
        
        for(int i = len-1; i >= 0; i--) {
            for(int j = 0; j < len; j++ ){
                if(sortedEmergency[i] == emergency[j]){
                    answer[j] = len - i;
                }
            }
        }
        
        return answer;
    }
}