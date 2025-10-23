import java.util.Scanner;

public class Lab4P5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the value for N : ");
        int N = x.nextInt();

        for (int i = 1; i <= N; i++) {
            int divisorCount = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount == 1) {
                System.out.println(i + " has 1 divisor");
            } 
            else {
                System.out.println(i + " has " + divisorCount + " divisors");
            }
        }
    }
}
