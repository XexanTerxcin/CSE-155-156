import java.util.Scanner;
import java.util.Arrays;

public class L5P3ReverseArray {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int size = x.nextInt();
        
        int numbers[] = new int[size];
        int reverse[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: "); 
            numbers[i] = x.nextInt();
        }

        // Reverse using a new array
        for (int i = 0; i < size; i++) {
            reverse[i] = numbers[size - 1 - i];
        }
        
        System.out.print("Reversed using a new array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(reverse[i]);
            if (i < size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Reverse the original array
        for (int i = 0; i < size / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }
        
        System.out.print("Reversed the original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i < size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}