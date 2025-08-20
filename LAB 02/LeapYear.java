import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year you wanna check :");
        Scanner x = new Scanner(System.in);
        int year = x.nextInt();

        if (year%4 == 0){

            if (year%100 == 0) {
                if (year%400 == 0){
                    System.out.println("It is a leap year");
                } else {
                    System.err.println("Not a leap year");
                }
            } else {
                System.out.println("It is a leap year");
            }
            
        } else {
            System.out.println("Not a leap year");
        }
    }
    
}
