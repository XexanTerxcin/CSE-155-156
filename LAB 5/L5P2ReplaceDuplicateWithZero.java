import java.util.Scanner;
import java.util.Arrays;

public class L5P2ReplaceDuplicateWithZero {
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
        for (int i = 0; i < size; i++) {
            result[i] = numbers[i];
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    result[j] = 0;
                }
            }
        }
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Modified array: " + Arrays.toString(result));
        

    }
}
