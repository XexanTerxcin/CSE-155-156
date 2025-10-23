import java.util.Scanner;
public class Problem2_LeapYearChecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = x.nextInt();

        if (year % 4 == 0)  {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It is a leap year.");
                }
                else {
                    System.out.println("It is not a leap year.");
                }
            }
            else {
                System.out.println("It is a leap year.");
            }
        }
        else {
            System.out.println("It is not a leap year.");
        }
       
    }
    
}
