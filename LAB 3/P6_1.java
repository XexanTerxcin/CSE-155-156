import java.util.Scanner;

public class P6_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Terms: ");
        int n = x.nextInt();
        int total = 0;
        
        System.out.println("Odd values:");
        for (int i = 1; i < n * 2; i += 2) {
            System.out.println(i);
            total += i;
        }
        
        System.out.println("Sum of " + n + " terms: " + total);
    }
}