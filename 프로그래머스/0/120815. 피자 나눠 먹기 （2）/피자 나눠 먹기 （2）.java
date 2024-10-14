class Solution {
    public int solution(int n) {
        int answer = 1;
        int cnt= 6;
        while(true) {
            if(cnt % n ==0) {
                break;
            }
            cnt +=6;
            answer +=1;
        }
        return answer;
    }
}