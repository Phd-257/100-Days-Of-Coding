package Hundred_Days_Of_Code;

public class MergeSort {
 
 
    public static void main(String[] args) {
            int[] arr = {6,7,3,3,3,1,2};
            
            mergerArray(arr, 0, arr.length-1);

            for (int i : arr) {
                System.out.print(i+" ");
            }
        


    }

    public static void mergerArray(int[] array, int left, int right){

        if(right>left){
        int m = (left+right)/2;
        mergerArray(array, left, m);
        mergerArray(array, m+1, right);
        merge(array,left,m,right);
        }
    }
    public static void merge(int[] array , int left, int mid,int right){

        int[] leftTmpArray = new int[mid-left+2];
        int[] rightTmpArray = new int[right-mid+1];

        for (int i = 0; i <= mid-left; i++) {
            
            leftTmpArray[i] = array[left+i];
        }
        for (int i = 0; i < right-mid; i++) {

            rightTmpArray[i] = array[mid+1+i];   
        }

        leftTmpArray[mid-left+1]= Integer.MAX_VALUE;
        rightTmpArray[right - mid] = Integer.MAX_VALUE;

        int i = 0 , j = 0;

        for (int k = left; k <= right; k++) {
            if(leftTmpArray[i]<rightTmpArray[j]){
                array[k] = leftTmpArray[i];
                i++;

            }
            else{
                array[k] = rightTmpArray[j];
                j++;
            }
            
        }

    }
}
