package Hundred_Days_Of_Code;

import java.util.Arrays;

public class L_ContainsDuplicate {

    //Given an integer array nums, 
    //return true if any value appears at least twice in the array,
    // and return false if every element is distinct.
   //Example 1:
   //Input: nums = [1,2,3,1]
   //Output: true

    public static void main(String[] args) {

        int[] x = {1,2,3,1};
        System.out.println(containsDuplicate(x));

        
    }
    public static boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i =0; i<nums.length-1;i++){
           if(nums[i]==nums[i+1]){
               
               return true;
           }
            
        }
        return false;
        
        
    }

    
}
