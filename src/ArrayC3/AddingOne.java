package ArrayC3;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingOne {
    static Vector<Integer> addOne(int[] arr) {
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;
        // Start from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {

                ans.add(arr[i] + carry);
                carry = 0;
            } else {

                ans.add(0);
                carry = 1;
            }
        }
        // Example: 999 + 1 = 1000
        if (carry == 1) {
            ans.add(1);
        }
        Collections.reverse(ans);
        return ans;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter digits: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Vector<Integer> ans = addOne(arr);
        System.out.print("After adding 1: ");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}