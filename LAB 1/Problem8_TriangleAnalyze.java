import java.util.Scanner;

public class Problem8_TriangleAnalyze {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter the first angle : ");
        double a = x.nextDouble();

        System.out.println("Enter the second angle : ");
        double b = x.nextDouble();

        System.out.println("Enter the third angle : ");
        double c = x.nextDouble();

        if (a+b+c == 180) {
            if (a == b && b == c) {
            System.out.println("Equilateral (all sides equal)");
        }
        else if (a == b || b == c || c == a) {
            System.out.println("Isosceles (two sides equal)");
        }
        else {
            System.out.println("Scalene (no sides equal)");
        }
        }
        else {
            System.out.println("Error. It's not a triangle.");
        }

    }
}