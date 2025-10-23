import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int number;
        
        while (true) {
            System.out.print("Enter Number: ");
            number = x.nextInt();
            
            if (number < 0) {
                System.out.println("Exiting the program");
                break;
            }
            else {
                System.out.println(number + " ^ 2 = " + (number * number));
            
            }
    }
}
}