import java.util.Scanner;

public class Problem6_4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter a long integer: ");
        long number = x.nextLong();
        int count = 0;

        for (long i = 10; number > 1 ; number = number / 10) {
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
    
}
