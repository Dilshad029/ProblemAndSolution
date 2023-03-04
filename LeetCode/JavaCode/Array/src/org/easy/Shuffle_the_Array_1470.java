package org.easy;

import java.util.Arrays;

public class Shuffle_the_Array_1470 {

    public static void main(String[] args) {
           int[] output = {2,3,5,4,1,7};
           int[] input = {2,5,1,3,4,7};
           if (Arrays.compare(output, shuffle(input, 3)) == 0){ // size of array/2 = n
               System.out.println("Accepted");
           } else {
               System.out.println("Wrong ANS");
           }
    }

    public static int[] shuffle(int[] nums, int n) {

        int count = 0;
        int[] arr = new int[2*n];
        for(int i=0; i< n;i++){
            arr[count] = nums[i];
            arr[count+1]=nums[i+n];
            count +=2;
        }
        return arr;
    }
}
