//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//Remove Duplicates from Sorted Array

import java.io.IOException;

public class testfour {
    public static void main(String[] args) throws IOException {
        int[] nums = {0,0,1,1,1,2,2,3,4,4};
        removeDuplicates(nums);
        for (int l=0; l< nums.length;l++)
        {
        System.out.println(nums[l]);
        }
    }
    
    public static void removeDuplicates(int[] nums) {
        int loc=0;
            for(int i=0; i<nums.length; i++) {
                if(nums[i]!= nums[loc])
                {
                    loc++;
                    nums[loc]=nums[i];
                }
            }

        }

}
