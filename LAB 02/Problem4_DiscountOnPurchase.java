import java.util.Scanner;

public class Problem4_DiscountOnPurchase {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter your total purchased amount in BDT :");
        double amount = x.nextDouble();

        if (amount >= 8000) {

            System.out.println("You've won a free gift");    
            }    
        else if (amount >= 5000) {
            System.out.println("You've got 20% discount");
        }
        else if (amount >= 2000) {
            System.out.println("You've got 10% discount.");
        }
        else{
            System.out.println("Sorry, no discount for you.");
        }
}
}