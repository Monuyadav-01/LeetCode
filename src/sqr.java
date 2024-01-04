public class sqr {


    static long floorSqrt(long x) {
        // Your code here

    /*    for (int i = 1; i <= x; i++) {
            if ((long) i * i == x) {
                return i;
            } else if ((long) i * i > x) {
                return i - 1;
            }
        }
        return -1;

     */


        int s =1;
        int e = (int) x;

        while(s <=e){
            int mid =s+(e-s)/2;

            if(mid == x/mid){
                return mid;
            }
            if(mid > x/mid){
                e = mid -1;
            }
            else{
                s  = mid+1;
            }
        }
        return e;


    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(floorSqrt(x));
    }
}
