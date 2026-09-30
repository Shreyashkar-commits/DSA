package ArrayC2;

public class ReverseArray {
    static void main() {
        int arr [] = {6,8,1,2,4,9};
        int n = arr.length;
        int i =0 ,j = n-1; // i = 2 , j = 5 then 1,2,4 will reverse only
        while(i<j){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
