

import java.util.Scanner;
public class GroupSum {




        public static boolean groupSumClump(int[] nums, int target) {
            return groupSumClumpHelper(nums, 0, target);
        }

        public static boolean groupSumClumpHelper(int[] nums, int start, int target) {
            if (start >= nums.length) {
                return target == 0;
            }

            int count = 1;
            while (start + count < nums.length && nums[start] == nums[start + count]) {
                count++;
            }

            if (groupSumClumpHelper(nums, start + count, target - (nums[start] * count))) {
                return true;
            }

            if (groupSumClumpHelper(nums, start + count, target)) {
                return true;
            }

            return false;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int N = scanner.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            int k = scanner.nextInt();

            boolean result = groupSumClump(arr, k);
            System.out.println(result);

        }
    }

