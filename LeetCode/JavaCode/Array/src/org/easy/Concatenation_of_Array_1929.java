package org.easy;

import java.util.Arrays;

public class Concatenation_of_Array_1929 {

    public static void main(String[] args) {
           int[] output = {1,2,1,1,2,1};
           int[] input = {1,2,1};
           if (Arrays.compare(output, getConcatenation(input)) == 0){
               System.out.println("Accepted");
           } else {
               System.out.println("Wrong ANS");
           }
    }

    public static int[] getConcatenation(int[] nums) {

        int [] ans = new int [ nums.length*2] ;
        for (int i = 0 ; i< nums.length *2; i++){
            if (i >=  nums.length){
                ans[i] = nums[i- nums.length];
            } else {
                ans[i] = nums[i];
            }

        }
        return ans;
    }
}
