class Solution {
    public int solution(int price) {
        double discountRate = 1.0; 

        if (price >= 500000) {
            discountRate = 0.8;
        } else if (price >= 300000) {
            discountRate = 0.9;
        } else if (price >= 100000) {

            discountRate = 0.95;
        } 

        double answer = price * discountRate;

        return (int) answer;
    }
}