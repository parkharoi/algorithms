class Solution {
    public int[] solution(long n) {
        String strN = Long.toString(n);
        int[] result = new int [strN.length()];
        
        for (int i = 0; i < strN.length(); i++) {
            result[i] = Character.getNumericValue(strN.charAt(strN.length() - 1 - i));
        }

        return result;
    }
}