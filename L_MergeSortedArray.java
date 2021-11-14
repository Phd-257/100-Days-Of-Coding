package Hundred_Days_Of_Code;

public class L_MergeSortedArray {
    
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int n = num1.length;
        int m = num2.length;
    

        merge(num1,num2,3,m);
        

    }

    private static void merge(int[] nums1, int[] nums2, int n, int m)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[n+m];
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
            ans[k++] = nums1[i++];
        }
        else{
             ans[k++] = nums2[j++];
        }
        }
        while(i < m){
            ans[k++] = nums1[i++];
        }
        while(j < n){
            ans[k++] = nums2[j++];
        }
        for(int p=0;p<n+m;p++){
            nums1[p] = ans[p];
        }
        for (int l : ans) {
            System.out.print(l+" ");
            
        }

    }
}
