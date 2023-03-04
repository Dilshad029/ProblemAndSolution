package org.easy;

import java.util.Arrays;
import java.util.HashMap;

public class Number_of_Good_Pairs_1512 {

    public static void main(String[] args) {
           int[] input = {1,2,3,1,1,3};
           if (numIdenticalPairs(input) == 4){
               System.out.println("Accepted");
           } else {
               System.out.println("Wrong ANS");
           }
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int ans = 0;

        for(int num:nums)
        {
            int count = hm.getOrDefault(num,0);
            ans=ans+count;
            hm.put(num,count+1);
        }


        return ans;
    }
}
