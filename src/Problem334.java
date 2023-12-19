import java.util.Arrays;

public class Problem334 {


    public static boolean increasingTriplet(int[] nums) {

// using dp
//        int n  = nums.length;
//        int[] dp = new int[n];
//        Arrays.fill(dp,1);
//        for(int i =0;i<n;i++){
//            for(int j = 0;j<i;j++) {
//                if (nums[j] < nums[i]){
//                   dp[i] = dp[j]+1;
//                }
//                if(dp[i]>=3){
//                    return true;
//                }
//            }
//        }
//        return false;


        if (nums == null || nums.length < 3) {
            return false;
        }

        int len = nums.length;
        int[] leftMin = new int[len];
        leftMin[0] = nums[0];
        for (int i = 1; i < len; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }

        int[] rightMax = new int[len];
        rightMax[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > leftMin[i] && nums[i] < rightMax[i]) {
                return true;
            }
        }

        return false;


    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));

    }
}
