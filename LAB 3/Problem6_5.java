import java.util.Scanner;

public class Problem6_5 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = x.nextInt();
        
        if (number == 0) {
            System.out.println("0");
            return;
        }
        if (number < 0) {
            System.out.print("-");
            number = -number;
        }

        int alligator = number;
        int digitCount = 0;

        while (alligator > 0) {
            digitCount++;
            alligator = alligator / 10;
        }
        int divisor = 1;
        for (int i = 1; i < digitCount; i++) {
            divisor = divisor*10;
        }
        int count = 0;
        while (divisor > 0) {
            int digit = number / divisor;
            if (count == 0) {
                System.out.print(digit);
            } else {
                System.out.print(", " + digit);
            }
            number = number % divisor;
            divisor = divisor / 10; 
            count++;
        }
    }
}