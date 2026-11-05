package Recursion;

import static java.nio.file.Files.exists;

public class OnArrays {
    static void main() {
        int [] arr = {5,3,7,12,76,9,34,5};
//        recursivePrint (arr, 0);
        int target =76;
        System.out.println(exists(arr,target,0));
    }
    static boolean exists(int[] arr, int target , int idx){
    if (idx== arr.length) return false;
    if (arr[idx]==target) return true;
    return exists(arr,target,idx+1);
    }




    static void recursivePrint(int[] arr , int idx){
        if (idx == arr.length) return ;
//        System.out.print(arr[idx]+" ");
        recursivePrint(arr,idx+1);
        System.out.print(arr[idx]+" "); // call le bad kaam will reverse
    }
}
