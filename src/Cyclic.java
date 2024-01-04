import java.util.ArrayList;

public class Cyclic {
    private int[] arr;

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 4, 2, 1, 3};
        int n = arr.length;
        rotate(arr, n);
    }

    public static void rotate(int[] arr, int n) {

        int x = arr[n - 1];
       for(int i  = arr.length-1;i>0;i--){
           arr[i] = arr[i-1];
       }
       arr[0] = x;
//
//       for(int i =0 ;i<n;i++){
//           System.out.println(arr[i]);
//       }
    }
}
