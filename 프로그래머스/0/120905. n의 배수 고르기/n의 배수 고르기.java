import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> bae = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) 
                bae.add(num);
        }
        
        int[] result = new int[bae.size()];
        for (int i = 0; i < bae.size(); i++) {
            result[i] = bae.get(i);
        }
        return result;
    }
}