package BinarySearch;

public class BinarySearchIndescOrder {
    public static void main(String[] args) {
        int[] arr = {72, 56, 38, 23, 16, 12, 8, 5, 2};
        int target = 12;
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                low = mid + 1;       // go RIGHT
            }
            else if (arr[mid] < target) {
                high = mid - 1;      // go LEFT
            }
            else {
                System.out.println("Found at index: " + mid);
                break;
            }
        }
    }
}