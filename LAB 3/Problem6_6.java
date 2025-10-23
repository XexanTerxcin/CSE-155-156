import java.util.Scanner;

public class Problem6_6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = x.nextInt();
        int count = 0;
        int alligator = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                alligator = alligator + i;
                count++;
            }
        }

        if (count == 2) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
            
        }

        if (number == alligator - number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}