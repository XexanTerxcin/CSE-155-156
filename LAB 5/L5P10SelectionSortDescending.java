/*Take an integer N input from the user and create an array of length N by taking
the elements as user input. Then, print the array. Next, sort the array in descending
order using Selection Sort technique. Lastly, print the sorted array.*/


import java.util.Scanner;
import java.util.Arrays;

public class L5P10SelectionSortDescending {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int N = x.nextInt();

        int[] Array = new int[N];

        System.out.println("Enter " + N + " elements :");
        for (int i = 0; i < N; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            Array[i] = x.nextInt();
        }

        System.out.println("\nOriginal array :");
        System.out.println(Arrays.toString(Array));

        for (int i = 0; i < N - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (Array[j] > Array[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = Array[maxIndex];
                Array[maxIndex] = Array[i];
                Array[i] = temp;
            }
        }

        System.out.println("\nArray sorted in descending order :");
        System.out.println(Arrays.toString(Array));

    }
}