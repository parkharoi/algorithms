class Solution {
    public int solution(String[] s1, String[] s2) {
        int cnt = 0;
        for (String c : s1) {
            for(int i = 0; i < s2.length; i++) {
                if (s2[i].equals(c)) {
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
}