package TwoDAraay;
public class RowNumberWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maxSum = Integer.MIN_VALUE;
        int rowNumber = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                rowNumber = i;
            }
        }
        System.out.println("Row Number: " + rowNumber);
        System.out.println("Maximum Sum: " + maxSum);
    }
}