import java.util.Scanner;

public class P6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cumulative = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter #" + i + ": ");
            cumulative += in.nextInt();
            System.out.println("Total: " + cumulative);
        }
    }
}