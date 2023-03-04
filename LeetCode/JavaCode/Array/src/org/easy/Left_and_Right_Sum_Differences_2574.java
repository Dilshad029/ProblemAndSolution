package org.easy;

import java.util.Arrays;

public class Left_and_Right_Sum_Differences_2574 {

    public static void main(String[] args) {
           int[] output = {15,1,11,22};
           int[] input = {10,4,8,3};
           if (Arrays.compare(output, leftRigthDifference(input)) == 0){ // size of array/2 = n
               System.out.println("Accepted");
           } else {
               System.out.println("Wrong ANS");
           }
    }

    public static int[] leftRigthDifference(int[] nums) {
        int leftSum = 0, rightSum = 0, n = nums.length;
        for(int num : nums) rightSum += num;
        for(int i = 0; i < n; i++) {
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }
        return nums;
    }
}
