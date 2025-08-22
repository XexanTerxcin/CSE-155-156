import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter your total purchased amount in BDT :");
        double amount = x.nextDouble();

        System.out.println("Are you a loyal member? (select an option 1 or 2)");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int option = x.nextInt();

        if (amount >= 5000) {
            if (option == 1) {
                System.out.println("You'll get 20% discount");    
            }
            else if(option == 2) {
                System.out.println("You'll get 10% discount");
            }
            else {
                System.out.println("Invalid option");
            }
        }
        else {
             System.out.println("You'll get 5% discount");
        }
    }    
}
