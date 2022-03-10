/*Plus One
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.

https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) throws IOException {
        //int[] nums = {1, 2};
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        //int[] digits = {9, 9, 9};
        int[] nums= plusOne(digits);
    }

    private static int[] plusOne(int[] digits) {
        //Not accepted solution because of the constraints of the test case
//        Long p=Long.valueOf(0);
//        for(int i=0;i<digits.length; i++)
//        {
//            long s = (long) Math.pow(10,(digits.length-i-1));
//            p=p+digits[i]*s;
//        }
//        p=p+1;
//        System.out.println(p);
//        String temp = Long.toString(p);
//        int[] newArray = new int[temp.length()];
//        for (int i = 0; i < temp.length(); i++)
//        {
//            newArray[i] = temp.charAt(i) - '0';
//        }

        //The accepted solution
        int length= digits.length;
        int[] newArray = new int[length];
        int carry = 0;
        int sum=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(i== digits.length-1){
                sum=digits[i]+1;
            }
            else {
                if(carry==1){
                    sum=digits[i]+carry;
                }
                else{
                    sum=digits[i];
                    carry=0;
                }
            }
            if(sum>9){
                newArray[i]=0;
                carry=1;
            }
            else {
                newArray[i]=sum;
                carry=0;
            }
        }
        //for the case only when extra digit appears in the right after addition
        if(carry==1){
            //Array to ArrayList Conversion
            List<Integer> intList = new ArrayList<Integer>(newArray.length);
            for (int i : newArray)
            {
                intList.add(i);
            }
            //adding the extra carry 1
            intList.add(0,1);
            System.out.println(intList);
            // ArrayList to Array Conversion
            int listsize= intList.size();
            int[] arr = new int[listsize];
            for (int i = 0; i < intList.size(); i++) {
                arr[i] = intList.get(i);
            }
            return arr;
        }

        return newArray;
    }
}
