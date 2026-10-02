package BinarySearch;
public class BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72};
        int target = 23;
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1; // go left
            }
            else if (arr[mid] < target) {
                low = mid + 1; // go right
            }
            else {
                System.out.println("Found at index: " + mid);
                break;
            }
        }
    }
}