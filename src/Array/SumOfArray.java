package Array;

import java.util.Scanner;

public class SumOfArray {
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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}