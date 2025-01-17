class Solution {
    public String solution(int age) {
        return String.valueOf(age)
                     .chars()
                     .mapToObj(c -> String.valueOf((char) ('a'+ (c - '0'))))
                     .reduce("", String::concat);
    }
}