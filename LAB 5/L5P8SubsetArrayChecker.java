import java.util.Scanner;
import java.util.Arrays;

public class L5P8SubsetArrayChecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = x.nextInt();
        int array1[] = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("index[" + i + "] = "); 
            array1[i] = x.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = x.nextInt();
        int array2[] = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("index[" + i + "] = "); 
            array2[i] = x.nextInt();
        }

        boolean isSubset = true;
        for (int i = 0; i < size2; i++) {
            boolean found = false;
            for (int j = 0; j < size1; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("The second array is a subset of the first array.");
        } else {
            System.out.println("The second array is not a subset of the first array.");
        }
    }
}
