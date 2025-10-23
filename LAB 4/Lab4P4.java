import java.util.Scanner;

public class Lab4P4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a value for N : ");
        int N = x.nextInt();
        long sum = 0;
        
        for (int i = 1; i <= N; i++) {

            long factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            sum += factorial;
        }
        
        System.out.println("The sum is : " + sum);
    }
}
