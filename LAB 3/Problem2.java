import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("Enter the first amount of Number you want calculate");   
    int N = x.nextInt();

    double sum = 0;
    double avg = 0;

    for (int i = 1; i <=N; i++) {
        System.out.print(i+") Enter the number you want add : ");
        int A = x.nextInt();
        sum = sum+A;
    }
    System.out.println("Sum = " + sum);
    avg = sum/N;
    System.out.println("Average = " + avg);
    }
    
}
