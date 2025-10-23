import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = x.nextInt();
        
        System.out.println("Divisors of " + number + ":");
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}