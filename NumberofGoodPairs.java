import java.util.Arrays;
import java.util.HashMap;

public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,2,1};
        System.out.println(numIdenticalPairs(arr));
    }
    private static int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){

                map.put(nums[i], map.get(nums[i])+1);
                
            }
            else{
            map.put(nums[i], 1);
            }
            
        }
        //System.out.println(Arrays.asList(map)); // method 1

        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
            
                int c=map.get(nums[i])-1;
                int x  = c>0&&c<2?1:(c*(c+1))/2;
                sum=sum+x;
                map.remove(nums[i]);

            }
        }
        return sum;
        

    }
    
}
