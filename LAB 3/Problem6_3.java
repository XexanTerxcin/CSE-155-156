import java.util.Scanner;

public class Problem6_3 {
public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("Enter a positive number: ");
    int N = x.nextInt();
    if (N > 0) {
        for (int i = 5; i <= N; i = i+5) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
    else{
        System.out.println("Error! Negative number entered. Please enter a positive number.\n");
        return;
    }
}
}