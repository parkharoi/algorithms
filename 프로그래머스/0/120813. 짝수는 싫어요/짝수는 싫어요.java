class Solution {
    public int[] solution(int n) {
        int count = (n+1)/2;
        int[] answer = new int[count];
        int index = 0 ;
        for (int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                answer[index]=i;
                index++;
            }
        }
        return answer;
    }
}