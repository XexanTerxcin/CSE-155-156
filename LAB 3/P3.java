import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Input: ");
            n = input.nextInt();
            if (n >= 0) System.out.println(n + " squared = " + (n * n));
        } while (n >= 0);
    }
}