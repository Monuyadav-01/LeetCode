import java.util.Arrays;
import java.util.PriorityQueue;

public class Pro215 {


    /*
     public static int findKthLargest(int[] nums, int k) {
         Arrays.sort(nums);
         int n  = nums.length;
         return nums[n-k];
     }
    */

    public static int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0;i<nums.length;i++){
           pq.add(nums[i]);
           if(pq.size() > k){
               pq.remove();
           }

        }
        return  pq.peek();
    }

    public static void main(String[] args) {
    int []nums = {3,2,1,5,6,4};
    int k =2;

//        System.out.println(findKthLargest(nums,k));
        System.out.println(findKthLargest(nums,k));

    }
}
