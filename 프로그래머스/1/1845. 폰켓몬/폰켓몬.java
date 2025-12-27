import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        if(answer >= set.size()) {
            return set.size();
        }
        return answer;
    }
}