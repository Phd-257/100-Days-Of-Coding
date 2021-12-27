public class MeargedSortedArray {
    
    public static void main(String[] args) {
        
        int nums1[] = {2,3,8,0,0,0}, m = 3, nums2[] = {1,5,6};

        merge(nums1, m, nums2, m);
        for (int i : nums1) {
            System.out.print(i+" ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
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
    }
}