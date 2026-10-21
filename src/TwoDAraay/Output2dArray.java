package TwoDAraay;

public class Output2dArray {
    static void main() {
//    int [] [] arr= new int [3][4];
    int [][] arr= {{9,8,2,4,0},{7,8,6,9,7},{9,5,6,7,2}};
        System.out.println(arr.length+" "+arr[0].length); //no of rows ,column
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
