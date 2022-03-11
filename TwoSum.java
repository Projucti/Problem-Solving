/* Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
* */

import java.io.IOException;

public class TwoSum {
    public static void main(String[] args) throws IOException {
        //int[] nums = {9,8,7,5,4,3,2,1,0};
        int[] nums = {1,3,4,2};
        int target=6;
        int[] result= twoSum(nums,target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    private static int[] twoSum(int[] nums, int target) {
        int temp;
        for (int i=0; i<nums.length; i++){
            temp=target-nums[i];
            for(int j= i+1; j<nums.length; j++){
                if(nums[j]==temp)
                {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }

}
