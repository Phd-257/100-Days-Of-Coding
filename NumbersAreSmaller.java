import java.util.Arrays;
import java.util.HashMap;

public class NumbersAreSmaller {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        smallerNumbersThanCurrent(nums);
        
        for (int i : nums) {
            System.out.println(i);
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int length=nums.length;
        int[] nums1=nums.clone();
        HashMap<Integer,Integer> map  = new HashMap<>();
        Arrays.sort(nums1);
        int[] ans = new int[nums.length];
        
         
        for (int i = ans.length-1; i >= 0; i--) {
            
            map.put(nums1[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {

            nums[i]= map.get(nums[i]);
             
        }
        return nums;
    }
}
