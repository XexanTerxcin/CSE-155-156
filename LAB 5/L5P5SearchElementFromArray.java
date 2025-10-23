import java.util.Scanner;
import java.util.Arrays;

public class L5P5SearchElementFromArray {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = x.nextInt();

        int numbers[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("index[" + i + "] = "); 
            numbers[i] = x.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = x.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                System.out.println("Element " + target + " found at index [" + i + "]");
            }
            /*else if(i == size - 1){
                if (numbers[i] != target) {
                    System.out.println("Element " + target + " not found in the array.");
                }
            }*/
        }
}
}