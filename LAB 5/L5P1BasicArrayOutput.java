import java.util.Scanner;
import java.util.Arrays;

public class L5P1BasicArrayOutput {
public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = x.nextInt();

    int numbers[] = new int[size];

    for (int i = 0; i < size; i++) {
        System.out.print("index[" + i + "] = "); 
        numbers[i] = x.nextInt();
    }

    System.out.println("The elements of the array are:");
    
    for (int i = 0; i < size; i++) {
        System.out.println("numbers[" + i + "] = " + numbers[i]);
    }

    System.out.println("Array elements: " + Arrays.toString(numbers)); 
    
    int[] newArray = new int[size + 1];
    System.out.println("Enter a new value to add to the array: ");
    int newValue = x.nextInt();
    System.out.println("New value : " + newValue);

    for (int i = 0; i < size; i++) {
        newArray[i] = numbers[i];
    }
    newArray[newArray.length-1] = newValue;
    
    System.out.println("New array elements: ");
    for(int i = 0; i < newArray.length; i++) {
        System.out.print(newArray[i] +" ");
    }

}    
}
