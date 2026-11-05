package Recursion;

import java.util.ArrayList;

public class StringsBasic {
    static void main() {
        String s = "Shreyashkar";
        chnage(s);
        System.out.println(s);

        String [] arr = {"baby","vidu","guddu"};
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ArrayList<String> al = new ArrayList<>();
        al.add("kiran");
        al.add("dev");
        al.add("ayan");
        System.out.println(al);
        chnage2(al);
        System.out.println(al);
    }
    static void chnage2(ArrayList<String> al){
        al.add("dharm"); // pass by reference 
    }

    static void chnage (String s){
       s = "giri" ;
    }
}
