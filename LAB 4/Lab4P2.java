import java.util.Scanner;

public class Lab4P2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter Number: ");
            int num = x.nextInt();

            if (num % 2 != 0) {
                break; 
            }
            if (num < 0) {
                num = -num;
            }
        
            int count = 0;
            int i = 1;
            while (i <= num) {
                if (num % i == 0) {
                    count = count + 1;
                }
                i = i + 1;
            }
            System.out.println(num + " has " + count + " divisors");
        }
    }
}