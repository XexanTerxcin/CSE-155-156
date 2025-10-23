import java.util.Scanner;
import java.util.Arrays;

public class L5P7RemoveDuplicateElementFromArray {
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = x.nextInt();

        int numbers[] = new int[size];
        int result[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("index[" + i + "] = "); 
            numbers[i] = x.nextInt();
        }
        
        /* Atkay gesi */



        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Modified array: " + Arrays.toString(result));
        

    }
}
