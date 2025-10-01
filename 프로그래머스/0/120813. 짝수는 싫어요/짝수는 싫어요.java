class Solution {
    public int[] solution(int n) {
        int[] result = new int[(n+1)/2];
        int i = 0;
        for (int j = 1; j <= n; j+=2) {
            result[i] = j;
            i+=1;
            
        }
        return result;
    }
}