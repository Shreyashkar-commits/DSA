package TwoDAraay;

public class TransposeOfSquareMatrix {
    static void main() {
        int[][] arr = {{2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2}};
        // Step 1: Transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) { //triangle shape
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Step 2: Print the transposed matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}