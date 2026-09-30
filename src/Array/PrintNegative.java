package Array;

import java.util.Scanner;

public class PrintNegative {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                System.out.print(arr[i] + " ");
    }
}