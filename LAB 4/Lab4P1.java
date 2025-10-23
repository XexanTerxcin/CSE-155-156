import java.util.Scanner;

public class Lab4P1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("To complete the operation, kindly input a number:");

        int N = x.nextInt();
        int b = 0;

        for(int i = 1; i<=N; i++){
            int sum = 0;
            for(int j=1; j<=i; j++){
                sum = sum + j;
            }
            b = b - sum;
        }
        System.out.println("The value of N : " + b);
    }
    
}
