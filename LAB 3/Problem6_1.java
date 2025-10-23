import java.util.Scanner;

public class Problem6_1 {
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("Enter number of terms: ");
    int N = x.nextInt();
    int sum = 0;

    System.out.println("The odd numbers are: ");
    for (int i = 0; i < N; i++) {
        int odd = 2*i + 1;
        System.out.println(odd);
        sum = sum + odd;
    }
    System.out.println("The Sum of odd Natural Numbers up to " + N + " terms is:" + sum);

}
}