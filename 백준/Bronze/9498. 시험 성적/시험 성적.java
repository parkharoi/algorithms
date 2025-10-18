import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int score = kb.nextInt();
        kb.close(); 
        
        String rating = (score >= 90) ? "A" :
                        (score >= 80) ? "B" :
                        (score >= 70) ? "C" :
                        (score >= 60) ? "D" : "F";
                            
        System.out.println(rating);
    }
}