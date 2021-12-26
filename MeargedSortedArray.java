public class MeargedSortedArray {
    
    public static void main(String[] args) {
        
        int nums1[] = {1,2,3,0,0,0}, m = 3, nums2[] = {2,5,6};

        merge(nums1, m, nums2, m);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int x = nums1.length-1-m;
        int y=nums2.length-1;
        while(i<x && j<y){

            if(nums1[i]<nums2[j]){
                nums1[k]= nums1[i];
                i++;
                k++;

            }
            else{
                int temp = nums2[j];
                nums2[j]=nums1[i];
                nums1[i]=temp;
                
            }

        }
    }
}
