package ArrayC2;

import java.util.Scanner;

public class SecondMaxInArray {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Find maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Find second maximum
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = " + smax);
    }
}