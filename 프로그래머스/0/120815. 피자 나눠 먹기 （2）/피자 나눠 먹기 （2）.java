class Solution {
    public int solution(int n) {
        int i = 6;
        int answer = 0;
        
        while(true) {
            if (i % n == 0) {
                answer += 1;
                break;
            } else {
                i += 6;
                answer += 1;
            }
        }
        return answer;
    }
}