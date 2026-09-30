package Array;

import java.util.Scanner;

public class MaxOfArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // INPUT
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }   // ← IMPORTANT: first loop ends here

        // PRINT
        int max = arr [0];
        for (int i = 0; i < n; i++) {
           if (arr[i]>max) {
               max = arr[i];
           }
        }
        System.out.println(max);
    }
}
