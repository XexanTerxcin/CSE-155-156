import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Quantity: ");
        int q = s.nextInt();
        double t = 0;
        
        for (int i = 0; i < q; i++) {
            System.out.print("Value " + (i+1) + ": ");
            t += s.nextDouble();
        }
        
        System.out.println("Total: " + t);
        System.out.println("Mean: " + (t / q));
    }
}