package Hundred_Days_Of_Code;

public class L_majority {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        
        
        int n = nums.length-1;
         int count=0;
         int majority=0;
         
         for(int i=0;i<=n;i++){
             
             if(count == 0){
                 
                 majority = nums[i];
             }
             if(nums[i]==majority){
                 count++;
                 
             }
             else{
                 count--;
             }
             
         }
         return majority;
         
     }
    
}
