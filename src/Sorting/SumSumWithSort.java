package Sorting;

import java.util.Arrays;
import java.util.Scanner;
public class SumSumWithSort{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        // Sort the array
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                return;
            }
            else if (sum > target) {
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("Pair not found");
    }
}