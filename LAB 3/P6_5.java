import java.util.Scanner;

public class P6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = Math.abs(sc.nextInt());
        
        if (num == 0) {
            System.out.println("0");
            return;
        }
        
        int power = 1;
        for (int temp = num; temp >= 10; temp /= 10) {
            power *= 10;
        }
        
        while (power > 0) {
            System.out.print((num / power) + (power > 1 ? "." : ""));
            num %= power;
            power /= 10;
        }
    }
}