import java.util.Scanner;

public class BusFareCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = x.nextInt();
        
        System.out.print("Enter distance (km): ");
        double distance = x.nextDouble();
        
        double fare = 0;
        
        
        if (age < 0 || distance < 0) {
            System.out.println("Age/Distance cannot be a negative number");
        }
        else if (age < 5) {
            System.out.println("Free ride for children under 5!");
        } 
        else if (age >= 5 && age <= 17) {
            if (distance > 20) {
                fare = (distance*10)/2 + 10;
                System.out.println("Half fare + TK 10 extra (distance > 20 km)");
            } else {
                fare = (distance*10)/2;
                System.out.println("Half fare");
            }
        } 
        else if (age >= 60) {
            if (distance > 20) {
                fare = (distance*10)/2;
                System.out.println("Half fare (distance > 20 km)");

            } else {
                fare = (distance*10)*0.3;
                System.out.println("30% fare");
            }
        } 
        else {
            if (distance > 50) {
                fare = distance*10 + 20;
                System.out.println("Full fare + TK 20 extra (distance > 50 km)");
            } else {
                fare = distance*10;
                System.out.println("Full fare");
            }
        }
        
        System.out.println("\n --------------FARE CALCULATION : ");
        System.out.println("Age : " + age + " years");
        System.out.println("Distance : " + distance + " km");
        System.out.println("Total Fare : " + fare + "BDT");
    }
}