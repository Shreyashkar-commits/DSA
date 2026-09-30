package ArrayC2;

import java.util.Scanner;

public class RotateArray {
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter rotation value d: ");
        int d = sc.nextInt();
        // Rotate array
        rotateArr(arr, d);
        // Print rotated array
        System.out.print("Rotated array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}