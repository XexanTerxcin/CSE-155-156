import java.util.Scanner;

public class P6_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Upper limit: ");
        int limit = scan.nextInt();
        
        if (limit <= 0) {
            System.out.println("Invalid range");
            return;
        }
        
        for (int i = 5; i <= limit; i += 5) {
            if (i % 3 != 0) System.out.println(i);
        }
    }
}