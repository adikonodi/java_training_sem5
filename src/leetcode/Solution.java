package leetcode;

public class Solution {

        public static int maxSubArray ( int[] nums){
            int currMax = nums[0];
            int globalMax = nums[0];
            for (int i = 1; i < nums.length; i++) {
                currMax = Math.max(nums[i], currMax + nums[i]);
                globalMax = Math.max(globalMax, currMax);
            }
            return globalMax;
        }
        public static void main(String[] args) {
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int result = maxSubArray(nums);
            System.out.println("Maximum subarray sum is: " + result);
        }
    }


