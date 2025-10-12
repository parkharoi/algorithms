import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) { 
            if (Character.isLowerCase(c)) {    
                result.append(Character.toUpperCase(c)); 
            } else if (Character.isUpperCase(c)) { 
                result.append(Character.toLowerCase(c)); 
            }
        }

        System.out.println(result.toString()); 
    }
}
