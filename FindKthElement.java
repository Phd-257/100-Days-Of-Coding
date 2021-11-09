// Given an array Arr of N positive integers, 
//find K largest elements from the array.
//The output elements should be printed in decreasing order.

// Example 1:

// Input:
// N = 5, K = 2
// Arr[] = {12, 5, 787, 1, 23}
// Output: 787 23
// Explanation: 1st largest element in the
// array is 787 and second largest is 23.

package Hundred_Days_Of_Code;

public class FindKthElement {
    
    public static void main(String[] args) {

        int arr[] = {4,2,3,1,5};
        int k = 2;
        int[] kth = new int[k];
        int count=1;
    

        mergeSort(arr, 0, arr.length-1);
        int same = kth[0] = arr[arr.length-1];

        for (int i = arr.length-2; i >=0; i--) {
            
            if(arr[i]!= same && count<k){

                kth[count] = arr[i];
                same = arr[i];
                count++;
            }
            
        }
            

        for (int i = 0; i < kth.length; i++) {
            System.out.print(kth[i]+" ");
        }
        
    }

    private static void mergeSort(int[] arr, int low, int high) {

        if(low<high){

            int mid = (high+low)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merger(arr, low, mid, high);

        }

    }
    private static void merger(int[] arr, int low, int mid,  int high){

        int[] leftTemp = new int[mid-low+1];
        int[] rightTemp = new int[high-mid];

        for (int i = 0; i < leftTemp.length; i++) {
        
            leftTemp[i] = arr[low+i];

        }
        for (int i = 0; i < rightTemp.length; i++) {
            rightTemp[i] = arr[mid+1+i];

        }
        int i=0;
        int j=0;
        int k =low;


        while(i<leftTemp.length && j<rightTemp.length){

            if(leftTemp[i]<rightTemp[j]){
                arr[k] = leftTemp[i];
                i++;
                k++;

            }
            else{
                arr[k] =  rightTemp[j];
                j++;
                k++;
            }

        }

        while(i<leftTemp.length){
            arr[k] = leftTemp[i];
                i++;
                k++;
        }
        while(j<rightTemp.length){

            arr[k] =  rightTemp[j];
                j++;
                k++;
        }


    }
}
