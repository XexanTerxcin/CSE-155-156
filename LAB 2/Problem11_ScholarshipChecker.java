import java.util.Scanner;

public class Problem11_ScholarshipChecker {
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
        
        System.out.print("Enter current CGPA: ");
        double currentCGPA = x.nextDouble();
        
        System.out.print("Enter previous CGPA: ");
        double previousCGPA = x.nextDouble();
        
        System.out.print("Enter number of warnings: ");
        int warningsCount = x.nextInt();
        
        System.out.print("Has misconduct flag? (Enter 1 or 2)\n1. Yes\n2. No\n");
        int misconductFlag = x.nextInt();
        
        System.out.print("Enter credits this term: ");
        int creditsThisTerm = x.nextInt();
        
        String decision = "";
        double scholarshipPercentage = 100; 
        
        if (misconductFlag == 1) {
            decision = "Revoke scholarship - misconduct";
            scholarshipPercentage = 0;
        }
        else if (currentCGPA >= 3.75) {
            if (warningsCount == 0) {
                decision = "Continue full scholarship - excellent performance";
                scholarshipPercentage = 100;
            }
            else if (warningsCount == 1) {
                decision = "Reduce scholarship by 25% - one warning";
                scholarshipPercentage = 75;
            }
            else {
                decision = "Reduce scholarship by 50% - multiple warnings";
                scholarshipPercentage = 50;
            }
        }
        else if (currentCGPA >= 3.5) { 
            boolean improved = currentCGPA > previousCGPA;
            if (improved && creditsThisTerm >= 12) {
                decision = "Continue 75% scholarship - improved performance with full credits";
                scholarshipPercentage = 75;
            }
            else {
                decision = "Reduce to 50% scholarship";
                scholarshipPercentage = 50;
            }
        }
        else if (currentCGPA >= 3.2) { 
            if (creditsThisTerm >= 9) {
                decision = "Probation - maintain minimum credits";
                scholarshipPercentage = 25; 
            }
            else {
                decision = "Revoke scholarship - insufficient credits";
                scholarshipPercentage = 0;
            }
        }
        else {
            decision = "Revoke scholarship - CGPA below 3.2";
            scholarshipPercentage = 0;
        }
        

        System.out.println("\nScholarship Decision: " + decision);
        if (scholarshipPercentage > 0) {
            System.out.println("Scholarship Percentage: " + scholarshipPercentage + "%");
        }
    }
}