import java.util.Scanner;

public class Problem8_UniversityAdmission {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
    
        System.out.print("Enter GPA: ");
        double gpa = x.nextDouble();
        
        System.out.print("Enter IELTS overall score: ");
        double ieltsOverall = x.nextDouble();
        
        System.out.print("Enter IELTS minimum band score: ");
        double ieltsBand = x.nextDouble();
        
        System.out.print("Has strong portfolio? (true/false): ");
        boolean hasPortfolio = x.nextBoolean();
        
        System.out.print("Enter track (HCI or DS): ");
        String track = x.next();
        

        if (gpa >= 3.7 && ieltsOverall >= 7.0 && ieltsBand >= 6.5) {
            System.out.println("Admit - Congratulations! You are admitted.");
        }
        else if (gpa >= 3.5) {
            if (track.equals("HCI") && hasPortfolio) {
                System.out.println("Admit Conditional - Based on HCI track with strong portfolio.");
            }
            else if (track.equals("DS") && ieltsOverall >= 7.5) {
                System.out.println("Admit Conditional - Based on DS track with IELTS >= 7.5.");
            }
            else {
                System.out.println("Reject - Does not meet conditional admission requirements.");
            }
        }
        else if (gpa >= 3.2) {
            if (ieltsOverall >= 6.5 && ieltsBand >= 6.0) {
                System.out.println("Offer 1-term bridge program - Meets bridge requirements.");
            }
            else {
                System.out.println("Reject - Does not meet bridge program requirements.");
            }
        }
        else {
            System.out.println("Reject - GPA below minimum threshold.");
        }
    }
}