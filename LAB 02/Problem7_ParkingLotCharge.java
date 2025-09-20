import java.util.Scanner;
public class Problem7_ParkingLotCharge {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Choose your vehicle :");
        System.out.println("1. Car\n2. Bike");
        System.out.print("Enter 1 or 2 : ");
        int v = x.nextInt();

        System.out.println("For how much time did you parked your vehicle?");
        System.out.print("Ans: ");
        float hour = x.nextFloat();

        System.out.println("Do you have membership?(Enter 1 or 2))\n1. Yes\n2. No");
        System.out.print("Membership status: ");
        int membership = x.nextInt();

        if (v == 1) {
            if (membership == 1) {
                if (hour <= 2) {
                System.out.println("Your parking charge is 80 BTC");
            } 
            else if (hour <= 5) {
                System.out.println("Your parking charge is 160 BTC");
            }
            else {
                System.out.println("Your parking charge is 240 BTC");
            }
            } 
            else if (membership == 2) {
                if (hour <= 2) {
                System.out.println("Your parking charge is 100 BTC");
            } 
            else if (hour <= 5) {
                System.out.println("Your parking charge is 200 BTC");
            }
            else {
                System.out.println("Your parking charge is 300 BTC");
            }
            }
            else {
                System.out.println("Invalid input");
            }
        } 
        else if (v == 2) {
            if (membership == 1) {
                if (hour <= 2) {
                System.out.println("Your parking charge is 45 BTC");
            } 
            else if (hour <= 5) {
                System.out.println("Your parking charge is 90 BTC");
            }
            else {
                System.out.println("Your parking charge is 135 BTC");
            }
            } 
            else if (membership == 2) {
                if (hour <= 2) {
                System.out.println("Your parking charge is 50 BTC");
            } 
            else if (hour <= 5) {
                System.out.println("Your parking charge is 100 BTC");
            }
            else {
                System.out.println("Your parking charge is 150 BTC");
            }
            }
            else {
                System.out.println("Invalid input");
            }
        } 
        else {
            System.out.println("Invalid input");
        }
    }
}
