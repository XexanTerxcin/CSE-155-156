import java.util.Scanner;

public class P6_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter integer: ");
        long num = Math.abs(s.nextLong());
        int digits = num == 0 ? 1 : 0;
        
        for (long n = num; n != 0; n /= 10) {
            digits++;
        }
        
        System.out.println("Digit count: " + digits);
    }
}