import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        Integer[] arr = Arrays.stream(numbers)
            .boxed()
            .toArray(Integer[]::new);

        // 문자열 결합 후 비교
        Arrays.sort(arr,(a, b) -> {
            String s1 = a + "" + b;
            String s2 = b + "" + a;
            return s2.compareTo(s1);
        });

        StringBuilder sb= new StringBuilder();
        for(int n : arr) {
            sb.append(n);
        }
        
        if(sb.charAt(0) =='0') return "0";

        return sb.toString();
    }
}
