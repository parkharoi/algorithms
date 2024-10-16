class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int j = 0; j <= my_string.length()-1; j++){
              for (int i = 1; i<= n; i++) {
                answer +=  my_string.charAt(j);
            }
        }

        return answer;
    }
}