import java.util.Scanner;

public class Problem3_ElectricBillCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the consumed amount of electric units : ");
        int unit = x.nextInt();

        if (unit <= 100) {
             System.out.println("The electric bill is : " + unit * 5);
        }
        else if (unit > 100 && unit <= 300) {
             System.out.println("The electric bill is : " + (100 * 5 + (unit - 100) * 7));
        }
        else {
             System.out.println("The electric bill is : " + (100 * 5 + 200 * 7 + (unit - 300) * 10));
        }
        
    }
    
}
