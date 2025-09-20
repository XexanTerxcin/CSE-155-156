import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        
        System.out.println("Factors of " + val + ":");
        for (int i = 1; i <= val; i++) {
            if (val % i == 0) System.out.println(i);
        }
    }
}