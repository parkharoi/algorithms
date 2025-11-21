class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answerBuilder = new StringBuilder();
        char [] chars = my_string.toCharArray();
        
        for (char c : chars) {
            for (int i = 0; i < n; i++) {
                 answerBuilder.append(c);
            }
        }
        return answerBuilder.toString();
    }
}