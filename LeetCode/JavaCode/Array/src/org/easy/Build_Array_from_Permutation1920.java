package org.easy;

import java.util.Arrays;

public class Build_Array_from_Permutation1920 {

    public static void main(String[] args) {
           int[] output = {0,1,2,4,5,3};
           int[] input = {0,2,1,5,3,4};
           if (Arrays.compare(output, buildArray(input)) == 0){
               System.out.println("Accepted");
           } else {
               System.out.println("Wrong ANS");
           }
    }

    public static  int[] buildArray(int[] nums) {
        int [] ans = new int [ nums.length] ;
        for (int i = 0 ; i< nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
