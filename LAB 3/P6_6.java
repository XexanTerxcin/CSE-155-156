import java.util.Scanner;

public class P6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Check number: ");
        int num = Math.abs(input.nextInt());
        int divisorSum = 0;
        boolean primeFlag = num > 1;
        
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                divisorSum += i;
                if (i != 1) primeFlag = false;
            }
        }
        
        System.out.println(num + " prime status: " + (primeFlag ? "YES" : "NO"));
        System.out.println(num + " perfect status: " + (divisorSum == num ? "YES" : "NO"));
    }
}