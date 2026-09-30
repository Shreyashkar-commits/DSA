package ArrayC2;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 5, 7, 8};
        // Size of c = size of a + size of b
        int[] c = new int[a.length + b.length];
        // Merge arrays
        merge(c, a, b);

        // Print merged array
        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        // Compare elements of a and b
        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        // If elements are left in a
        while (i < a.length) {
            c[k++] = a[i++];
        }
        // If elements are left in b
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}