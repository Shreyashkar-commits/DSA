package TwoDAraay;
public class SnakePattern {
    static void main() {
//        int[][] arr = {{9, 8, 2, 4, 0}, {7, 8, 6, 9, 7}, {9, 5, 6, 7, 2}};
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < arr[i].length; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            } else {
//                for (int j = arr[i].length - 1; j >= 0; j--) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//
//            System.out.println();
//        }
        int[][] arr = {{9, 8, 2, 4, 0}, {7, 8, 6, 9, 7}, {9, 5, 6, 7, 2}};
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                // Top to bottom
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Bottom to top
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}