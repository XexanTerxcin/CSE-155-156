
import java.util.Scanner;


public class StudentScoreCheck {
    public static void main(String[] args) {
        System.out.println("Enter your score : ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt(); 
        if (score > 50) {

            if (score > 80) {
                System.out.println("Distinction");
            } else {
                System.out.println("Pass");
            }
            
        } else {
            System.out.println("Fail");
        }
    }
}