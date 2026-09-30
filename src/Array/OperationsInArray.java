package Array;

import java.util.Scanner;
public class OperationsInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print((arr[i] + 10) + " ");
            else
                System.out.print((arr[i] * 2) + " ");
        }
    }
}
