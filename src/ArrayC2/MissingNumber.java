package ArrayC2;

import java.util.Scanner;
public class MissingNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Total numbers are from 1 to n
        int n = arr.length + 1;
        // Expected sum from 1 to n
        int sum = n * (n + 1) / 2;
        // Sum of given array
        int arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }
        // Missing number
        int missing = sum - arraySum;
        System.out.println("Missing Number = " + missing);
    }
}