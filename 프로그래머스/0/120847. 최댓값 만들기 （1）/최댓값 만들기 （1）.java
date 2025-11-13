import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int last = numbers.length - 1;
        int answer = numbers[last] * numbers[last-1];
        return answer;
    }
}