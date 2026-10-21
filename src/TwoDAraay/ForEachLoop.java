package TwoDAraay;

public class ForEachLoop {
    static void main() {
        int [][] arr = {{5,6,8},{8,9,3},{7,8,8}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int ele : arr[i]){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
        for (int[] a:arr){
            for (int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}


