package Hundred_Days_Of_Code;

import java.util.Arrays;

public class IntersectArrays {

    public static void main(String[] args) {
        
        int[] nums1  = {1,3,2};
        int[] nums2= {2,2};

        String st="";

        int k=0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if(nums1[i]==nums2[j]){
                        //n[k++] = nums1[i];
                        st=st+String.valueOf(nums1[i]);
                        break;
                }
                
                
            }
        }  
        
        String[] newk = st.split("");
        int[] n  = new int[(st.length()<((nums1.length<nums2.length)? nums1.length:nums2.length))?st.length():(nums1.length<nums2.length)? nums1.length:nums2.length];

        
        for (int i = 0; i < st.length(); i++) {
            n[i]=Integer.valueOf(newk[i]);
            
            
        }

        for (int i : n) {
            System.out.print(i+" ");
        }
    }
 
}
