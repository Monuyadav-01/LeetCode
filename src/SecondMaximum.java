public class SecondMaximum {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 15};
        int n = arr.length;
        System.out.println(print2largest(arr, n));
    }

    public static int print2largest(int[] arr, int n) {
        // code here
        int max = arr[0];
        int second_max = -1;
        for(int i = 1;i<n;i++){
            if(arr[i]>max){
                second_max = max;
                max  = arr[i];
            }
            else if(arr[i]>second_max && arr[i]!=max){
                second_max = arr[i];
            }
        }
        return  second_max;
    }
}
