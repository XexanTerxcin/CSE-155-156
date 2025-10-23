import java.util.Scanner;

public class Problem6_2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int N = 10;
        int sum = 0;
        int number = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");
            number = x.nextInt();
            sum = sum + number;
            System.out.println("Sum = " + sum);
        }

            
        
    }
}