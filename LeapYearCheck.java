import java.util.Scanner;

public class LeapYearCheck {
    
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a year : ");

        int year = x.nextInt();

        if (year%400 == 0) {
            System.out.println("It is a Leap Year");
        } else if(year%4 == 0 && year%100 != 0) {
            System.out.println("It is a Leap Year");
        }
        else{
            System.err.println("It is not a Leap Year");
        }

    }
}
