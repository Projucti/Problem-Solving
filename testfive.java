//Rotate Array
//Given an array, rotate the array to the right by k steps, where k is non-negative.
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/

import java.io.IOException;

public class testfive {
    public static void main(String[] args) throws IOException {
        //int[] nums = {1, 2};
        //int[] nums = {-1};
        int[] nums = {1, 2,3,4,5,6,7};
        int k = 2;
        rotateArray(nums, k);


        for (int l = 0; l < nums.length; l++) {
            System.out.println(nums[l]);
        }
    }

    public static void rotateArray(int[] nums, int k) {

        int[] temp = new int[nums.length];
        int i = k % nums.length;
        int j = nums.length - i;
        if (k != 0) {
            if (nums.length != k) {
                for (int m = 0; m < k; m++) {
                    if (j < nums.length) {
                        temp[m] = nums[j];
                    }
                    j++;
                }

                int n = 0;
                for (int p = i; p < nums.length; p++) {
                    if (n <= j) {
                        temp[p] = nums[n];
                    }
                    n++;
                }

                for (int l = 0; l < temp.length; l++) {
                    nums[l] = temp[l];
                }

            }
        }
    }
}
