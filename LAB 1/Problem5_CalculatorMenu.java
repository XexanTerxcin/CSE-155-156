import java.util.Scanner;

public class Problem5_CalculatorMenu {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int choice;
        
        System.out.println("\n Calculator Menu :  \n");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Enter your choice (1-5) : ");
            
        choice = x.nextInt();

        System.out.println("Enter first number: ");
        double a = x.nextDouble();

        System.out.println("Enter second number: ");
        double b = x.nextDouble();

        if (choice >= 1 && choice <= 5) {
            if (choice == 1) {
                System.out.println("Result: " + a + " + " + b + " = " + (a + b));
            }
            else if (choice == 2) {
                System.out.println("Result: " + a + " - " + b + " = " + (a - b));
            }
            else if (choice == 3) {
                System.out.println("Result: " + a + " × " + b + " = " + (a * b));
            }
            else if (choice == 4) {
                if (b != 0) {
                    System.out.println("Result: " + a + " ÷ " + b + " = " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
            }
            else{
                System.out.println("Thank you for using the calculator. Goodbye!");
            }
        }
        else {
        System.out.println("Invalid choice! Please enter a number between 1-5...");    
        }

    }
}