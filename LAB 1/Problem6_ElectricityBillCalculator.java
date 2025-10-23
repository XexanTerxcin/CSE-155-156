import java.util.Scanner;

public class Problem6_ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Enter the number of units consumed : ");
        double units = x.nextDouble();
        
        if (units < 0) {
            System.out.println("Error : Units cannot be negative");
        }
        
        double billAmount = 0;
        
        // First 100 units
        if (units >= 0 && units <= 100) {
            billAmount = units*2;
        }
        else if (units >= 101 && units <= 300) {
            billAmount = (units-100)*3 + 100*2;
        }
        else if (units >= 301 && units <= 500) {
            billAmount = (units-300)*5 + 200*3 + 100*2;
        }
        else{
            billAmount = (units-500)*7 + 200*5 + 200*3 + 100*2;
        }

        System.out.println("Total units consumed: " + units);
        System.out.println("Total electricity bill: BDT " + billAmount);
        
    }
}