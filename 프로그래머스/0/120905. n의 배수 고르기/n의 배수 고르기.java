import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> bae = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) 
                bae.add(numlist[i]);
        }
        
        int[] result = new int[bae.size()];
        for (int i = 0; i < bae.size(); i++) {
            result[i] = bae.get(i);
        }
        return result;
    }
}