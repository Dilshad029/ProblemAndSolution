package org.easy;

import java.util.Arrays;

public class Final_Value_of_Variable_After_Performing_Operations_2011 {

    public static void main(String[] args) {
           String[] input = {"--X","X++","X++"};
           if (finalValueAfterOperations(input) == 1 ){ // size of array/2 = n
               System.out.println("Accepted");
           } else {
               System.out.println("Wrong ANS");
           }
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations){
            x = x + (44 - op.charAt(1));
        }
        return x;

    }
}
