import java.util.Scanner;

public class Problem7_EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get employee details
        System.out.println("Enter employee's salary: ");
        double salary = scanner.nextDouble();
        
        System.out.println("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        
        
        double bonus;
        
        if (yearsOfService > 5) {
            if (salary < 50000) {
                bonus = salary * 0.10;  
            } 
            else {
                bonus = salary * 0.05;  
            }
        }
        else {
            bonus = salary * 0.02;      
        }

        System.out.println("Bonus amount : BDT " + bonus);

        
    }
}