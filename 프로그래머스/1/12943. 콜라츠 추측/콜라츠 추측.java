class Solution {
    public int solution(int num) {
        int cnt = 0;
            while(true){
                if (num == 1){
                    break;
                }
                else if (cnt >= 400) {
                    cnt = -1;
                    break;
                }
                else if (num % 2 == 0){
                    num = num / 2;
                    cnt++;
                }
                else {
                    num = num * 3 + 1;
                    cnt++;
                }
            }
        return cnt;
    }
}