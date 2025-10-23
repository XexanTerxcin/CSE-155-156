import java.util.Scanner;
import java.util.Arrays;

public class L5P6ArrayAnalyzer {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = x.nextInt();

        double numbers[] = new double[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("index[" + i + "] = "); 
            numbers[i] = x.nextDouble();
        }

        double sum = 0;
        double max = numbers[0];
        double min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < size; i++) {
            sum = sum + numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

        double average = (double) sum / size;

        System.out.println("Array elements: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max + " Index: " + maxIndex);
        System.out.println("Minimum: " + min + " Index: " + minIndex);

    }
}