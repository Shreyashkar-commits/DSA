package ArrayC3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayListInJava {
    static void main() {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

//        System.out.println(arr.get(2)); // arr[2]
//        arr.set(3,50); //arr[3]=50
//
//        System.out.println(arr); //not traversing the array
//        int n = arr.size(); //array length
//        for (int i = 0; i <n ; i++) {
//            System.out.print(arr.get(i)+" ");
//        }
//        System.out.println();
//        for (int ele:arr ){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        arr.add(78); // 25 21 18 50 10 78
//        arr.add(1,100);
//        System.out.print(arr);
//        System.out.println();
//        arr.remove(arr.size()-1);
//        System.out.print(arr);
//        System.out.println();
//        Collections.reverse(arr);
//        System.out.print(arr);

        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);

    }
}
