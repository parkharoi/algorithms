
import java.util.*;
import java.lang.*;

class Solution {
    public double solution(int[] arr) {
        // double answer = 0;
        // for(int a : arr) {
        //     answer += a;
        // }
        // return answer / arr.length;
        return Arrays.stream(arr).average().getAsDouble();
    }
}