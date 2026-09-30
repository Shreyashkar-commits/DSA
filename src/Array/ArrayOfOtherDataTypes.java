package Arrays;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {

        // Character array
        char[] arr = new char[8];

        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        */

        // String array
        String[] str = {"Abhinav", "Harsh", "Achyut", "Sahil", "Isha"};

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}