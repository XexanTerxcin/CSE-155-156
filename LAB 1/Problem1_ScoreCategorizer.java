import java.util.Scanner;

public class Problem1_ScoreCategorizer{
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter student's score (0-100): ");
        int score = x.nextInt();
        
                if (score >= 90 && score <= 100) {
                    System.out.println("Excellent");
                }
                else if (score >= 75 && score <= 89) {
                    System.out.println("Good");
                }
                else if (score >= 50 && score <= 74) {
                    System.out.println("Average");
                }
                else {
                    System.out.println("Fail");
                }

        }
}