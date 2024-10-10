import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String strN = Long.toString(n);
        
        String[] arrN = strN.split("");  
        Arrays.sort(arrN, Collections.reverseOrder());
        
        //가변적인 문자열
        StringBuilder sortedStr = new StringBuilder();
        for (String s : arrN) {
            sortedStr.append(s);
        }
        
        long answer = Long.parseLong(sortedStr.toString());
        
        return answer;
    }
}
