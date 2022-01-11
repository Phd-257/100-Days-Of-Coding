public class Quicksort {

    public static void main(String[] args) {
        
        int[] arr = {4,3,2,1,0};
        int r = arr.length-1;
        int l=0;

        quickSorting(arr, l, r);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
    public static void quickSorting(int[] arr, int l, int r){

        if(l<r){
        int pivot  = findPivot(arr,l,r);

        quickSorting(arr, l, pivot-1);
        quickSorting(arr, pivot+1, r);

        }
    }
    public static int findPivot(int[] arr, int l, int r){

        int pivot = arr[r];
        int i=l-1;
        

       for (int k = l; k < r; k++) {
           if(pivot>arr[k]){
               i++;
               int temp = arr[k];
               arr[k] = arr[i];
               arr[i]= temp; 
           }
        }
        int temp  = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;


        return i+1;
    }
}
