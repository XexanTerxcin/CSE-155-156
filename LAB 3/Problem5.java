import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = x.nextInt();
        
        int positiveCount = 0;
        int negativeCount = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = x.nextInt();
            
            if (number >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        
        System.out.println("Non-negative Numbers: "+ positiveCount);
        System.out.println("Negative Numbers: "+ negativeCount);
    }
}