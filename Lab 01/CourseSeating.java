import java.util.Scanner;

public class CourseSeating {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter number of enrolled students : ");
        int enrolled = x.nextInt();

        System.out.print("Enter number of available seats : ");
        int seat = x.nextInt();

        System.out.print("Enter current waitlist : ");
        int waitlist = x.nextInt();

        System.out.println("Is this a lab room? (Yes/No) : ");
        System.out.println("Type 1 or 0");
        System.out.println("* 1 ====== Yes");
        System.out.println("* 0 ====== No");
        int lab = x.nextInt();

        long total = enrolled+waitlist;

        if (lab == 1) {
            System.out.print("Enter the number of stools to be added as extra : ");
            int stools = x.nextInt();
            long total_seat = seat+stools;

            if (total <= total_seat) {
                System.out.println("Seat Assigned");
            }
            else {
                System.out.println("Section Closed");
            }
        }

        else if (lab == 0) {
            if (total <= seat) {
                System.out.println("Seat Assigned");
            }
            else {
                System.out.println("Section Closed");
            }
        }


        else {
            System.out.println("Invalid Input");
        }
        
    }
}