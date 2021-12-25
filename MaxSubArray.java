public class MaxSubArray {
    
    public static void main(String[] args) {
        
        int[] v ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(v));
    }

    public static int maxSubArray(int[] nums) { 
        
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i=1; i<nums.length; i++) {
             if(sum >= maxSum){
                maxSum = sum;
            }
            sum = sum + nums[i];
           
            if (sum < nums[i]) {
                sum = nums[i];
            }
            
        }
         if(sum >= maxSum){
                maxSum = sum;
            }
        return maxSum;
        
    }
}
