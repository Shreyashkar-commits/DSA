package TwoDAraay;
public class Max2dArrayElement {
    public static void main(String[] args) {
        int[][] arr = {
                {9, 8, 2, 4, 0},
                {7, 8, 6, 9, 7},
                {9, 5, 6, 7, 2}
        };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}