class Solution {
    public int solution(int price) {
        double discountRate = 0.0; // 할인율을 저장할 변수

        // 할인율 결정
        if (price >= 500000) {
            discountRate = 0.2; // 20% 할인
        } else if (price >= 300000) {
            discountRate = 0.1; // 10% 할인
        } else if (price >= 100000) {
            discountRate = 0.05; // 5% 할인
        }
        
        // 최종 가격 계산
        double discountedPrice = price * (1 - discountRate);
        
        // 할인된 가격을 정수형으로 변환하여 반환
        return (int) discountedPrice;
    }
}
