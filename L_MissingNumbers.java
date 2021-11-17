package Hundred_Days_Of_Code;

public class L_MissingNumbers {

    public static void main(String[] args) {
        
        int[] nums = {0,1};
        int n = nums.length;
        int ans = (n*(2+(n-1)))/2;
        for (int i = 0; i < nums.length; i++) {
            
            ans = ans-nums[i];
        }
        System.out.println(ans);
        
        
    }
   
    
}
