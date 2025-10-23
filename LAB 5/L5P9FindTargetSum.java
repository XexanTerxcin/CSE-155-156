import java.util.Scanner;
import java.util.Arrays;

public class L5P9FindTargetSum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = x.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("index[" + i + "] = ");
            numbers[i] = x.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = x.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Elements need to be added: " + numbers[i] + " & " + numbers[j]);
                    System.out.println("Index of the elements: [" + i + ", " + j + "]");
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(" ");
                break;
            }
        }

        if (!found) {
            System.out.println("Target value not found");
        }
    }
    
}
