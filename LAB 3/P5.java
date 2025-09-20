import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Count: ");
        int c = reader.nextInt();
        int pos = 0;
        
        for (int i = 0; i < c; i++) {
            System.out.print("Number " + (i+1) + ": ");
            if (reader.nextInt() >= 0) pos++;
        }
        
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + (c - pos));
    }
}