import java.util.HashMap;

public class LCSumofUniqueElements {

    public static void main(String[] args) {
        sumOfUnique(new int[]{1,2,3,1});
    }
    private static void sumOfUnique(int[] nums) {
        
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int sum = 0;

        // for (int i = 0; i < nums.length; i++) {
            
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i], 1);
        //     }
        // }

        // for (int i = 0; i < nums.length; i++) {
            
        //     if(map.get(nums[i])==1){
        //         sum = sum+nums[i];
        //     }
        // }


        // return sum;
        int[] cnt = new int[101];
        int res = 0;
        for(int n : nums)
        {

            cnt[n]++;
            if(cnt[n]==2)
            {
                res-=n;
            }
            else if(cnt[n]==1)
            {
                res+=n;
            }
        }
        
        System.out.println(res);
    }
}

