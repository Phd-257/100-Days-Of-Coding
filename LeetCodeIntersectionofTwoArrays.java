import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.security.sasl.SaslClient;

public class LeetCodeIntersectionofTwoArrays {
    
    public static void main(String[] args) {
      
        int[] nums1 = {4,9,5}, nums2 = {9,4,5,9,8,4};
        int[] s = intersection(nums1, nums2);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]+" ");
        }
        
    }
    private static int[] intersection(int[] nums1, int[] nums2) {

      
        List<Integer> k  =new ArrayList<>();
        HashMap<Integer,Integer> hash  = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {

            hash.put(nums1[i], 0);
            
        }
        for (int i = 0; i < nums2.length; i++) {
            
            if(hash.containsKey(nums2[i])){
               k.add(nums2[i]);
            }
            hash.remove(nums2[i]);
        }
        
        int[] ans = new int[k.size()];
         for (int i = 0; i < k.size(); i++) {
            ans[i] = k.get(i);
        }
        
        
        

        return ans;
     
    
        
        
    }
}
