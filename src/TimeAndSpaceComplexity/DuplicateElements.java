package TimeAndSpaceComplexity;

import java.util.Scanner;
public class DuplicateElements {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }
        // Expected sum of 1 to n
        int act = n * (n + 1) / 2;
        // Actual array sum
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += arr[i];
        }
        System.out.println("Duplicate = " + (sum - act));
    }
}