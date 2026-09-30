package Array;

import java.util.Scanner;

public class OutputAndInputArray {
    static void main() {
        Scanner sc= new Scanner(System.in);
//        int [] arr ={5,6,-8,9,10,3};
//        int n = arr.length; // 0 to n-1
//        for (int i = 0; i <n ; i++) { // length =6
//            System.out.print(arr [i]+ " ");
//        }

        // default value
        int [] Shrey =new int[7];
//        for (int i = 0; i <7 ; i++) { // length =6
//            System.out.print(Shrey[i] + " ");
//        }

        // input
        for (int i = 0; i <7 ; i++){
            Shrey[i]= sc.nextInt();
        }
        // print 
        for (int i = 0; i <7 ; i++){
            System.out.print(2*Shrey[i]+" "); // if same print remove 2
        }
    }
}
