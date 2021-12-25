import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class LCDuplicate {
 
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,1};

        System.out.println(containsDuplicate(nums));

        
    }
    public static boolean containsDuplicate(int[] nums) {
        boolean x=false;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
            map.put(nums[i], 1);}
        }


        
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])>1){
                x=true;
                break;
            
            }
        }

       return x;

    }
}
