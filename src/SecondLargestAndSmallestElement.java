public class SecondLargestAndSmallestElement {
//    public static int[] getSecondOrderElements(int n, int []a) {
//        // Write your code here.
//        int sLarge = secondLargest(n,a);
//        int sSmall = secondSmallest(n,a);
//
//        return new int[]{sLarge,sSmall};
//    }


    public static int secondLargest(int n, int[] a) {
        int large = a[0];
        int s_large = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > large) {
                s_large = large;
                large = a[i];
            } else if (a[i] > s_large && a[i] != large) {
                s_large = a[i];
            }
        }
        return s_large;
    }


    public static void main(String[] args) {


    }
}

