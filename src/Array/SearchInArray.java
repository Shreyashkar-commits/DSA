package Array;
import java.util.Scanner;
public class SearchInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // INPUT
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // NUMBER TO SEARCH
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        int found = -1; // -1 index target me exist nhi krta
        // SEARCH
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                found = i; // array index except -1
            }
        }
        // RESULT
        if (found!=-1) {
            System.out.println("Yes exist at index " +found);
        } else {
            System.out.println("No");
        }
    }
}