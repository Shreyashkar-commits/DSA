package ArrayC2;

import java.util.Scanner;

public class TwoSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Input array
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        // Check every pair
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println((arr[i] + "+" + arr[j]));
                }
            }
        }
    }
}