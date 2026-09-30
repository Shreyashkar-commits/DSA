package ArrayC2;

import java.util.Scanner;
public class WaveArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Swap adjacent elements
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        // Print wave array
        System.out.print("Wave Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}