package Array;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    static void main() {
        int[] arr = {12, 25, 56, 18};
//        int[] x = arr; // x is shallow copy of arr
//        x[0]=28;
//        System.out.print(arr[0]);
        int [] deep = Arrays.copyOf(arr, arr.length);
        deep[0]=100;
        System.out.println(arr[0]);
    }
}
