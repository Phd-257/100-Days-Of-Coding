package Hundred_Days_Of_Code;

public class BinaryArraySorting {
    
    public static void main(String[] args) {
        int arr[] = {1,0,0,0,1,1,0};

        //when we have binary Sorting or need to be sorted 
        //in O(n) time we have to use counter because
        //all the sorting technique take up to O(n* logn) time
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i]=0;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i]=1;
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
