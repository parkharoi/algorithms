class Solution {
    boolean solution(String s) {
        String small = s.toLowerCase();
        int p = 0;
        int y = 0;
        for(char m : small.toCharArray()) {
            if(m == 'p') {
                p += 1;
            }else if (m == 'y') {
                y += 1;
            }
        }
        return p != y ? false : true;
    }
}