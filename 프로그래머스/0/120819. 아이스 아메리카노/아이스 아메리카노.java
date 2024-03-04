class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        boolean handle = true;
        int count = 0;
        while (handle) {
            if (money < 5500) {
                handle = false;
            } else {
                money -= 5500;
                count += 1;
            }
        }
        answer[0] = count;
        answer[1] = money;
        return answer;
    }
}
