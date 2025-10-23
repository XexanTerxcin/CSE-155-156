import java.util.Scanner;

public class Problem2_LargestNumberAmongThree {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);    
        System.out.println("Enter three integers");
        

        System.out.println("First number : ");
        int a = x.nextInt();
        
        System.out.println("Second number : ");
        int b = x.nextInt();
        
        System.out.println("Third number : ");
        int c = x.nextInt();
        
        int Largest;
        
        if (a > b) {
            if (a > c) {
                Largest = a;
            }
            else {
                Largest = c;
            }
        }
        else {
            if (b > c) {
                Largest = b;
            }
            else {
                Largest = c;
            }
        }
        
        System.out.println("The largest number is : " + Largest);
        
    }
}