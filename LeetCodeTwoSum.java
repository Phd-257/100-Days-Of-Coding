import java.util.HashMap;

public class LeetCodeTwoSum {
    
    public static void main(String[] args) {

        int[] x={7,1,2,3};

        int[] b= twoSum1(x, 4);
     
        System.out.println(b[0]+" " +b[1]);
        
    }
    private static int[] twoSum1(int[] nums, int target) {
            int[] x = new int[2];
             int dif = 0;
            HashMap<Integer,Integer> h = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                dif = target-nums[i];
                if(h.containsKey(dif)){
                    x[0] = h.get(dif);
                    x[1]=i;
                    return x;
                }

                h.put(nums[i], i);
                
                
            }

            return x;
            
            
            
    }
           
    }

