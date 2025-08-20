import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        System.out.println("Enter your consumed Units :");
        Scanner x = new Scanner(System.in);
        int unit = x.nextInt();
        float bill = 0;

        if (unit <= 100) {
            bill = unit*5;
        } else if(unit>100 && unit<=300) {
            bill = 100*5 + (unit-100)*7;
        }
        else{
            bill = 100*5 + 200*7 + (unit-300)*10;
        }

        System.out.println("Bill : "+bill);

    }
}
