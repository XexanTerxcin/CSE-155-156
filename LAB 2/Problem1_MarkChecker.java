import java.util.Scanner;
public class Problem1_MarkChecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int mark = x.nextInt();
        if (mark > 50) {
            if (mark > 80) {
                System.out.println("Distinction.");
            }
            else {
                System.out.println("Pass.");
            }
        }
        else {
            System.out.println("Fail.");
        }
    }
    
}
