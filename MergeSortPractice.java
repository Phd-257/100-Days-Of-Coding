public class MergeSortPractice {
    
    public static void main(String[] args) {
        
        int[] arr  = {4,3,2,1,0};
        merger(arr, 0, arr.length-1);

       for (int i : arr) {
           System.out.print(i+" ");
       }
    }

    public static void merger(int[] arr, int left, int right){

        if (left<right){

        int m = (left+right)/2;

        merger(arr, left, m);
        merger(arr, m+1, right);
        merge(arr,left,m,right);

        }

    }
    public static void merge(int[] arr, int left, int mid, int right){

        int size1 = mid-left+1;
        int size2 = right - mid;

        //System.out.println(size1+" "+size2+" "+mid);


        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        for (int i = 0; i < size1; i++) {
            leftArray[i] = arr[left+i];
        }
        for (int i = 0; i < size2; i++) {
           rightArray[i]= arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=left;

        while(i<size1 && j<size2){
            if(leftArray[i]<rightArray[j]){
                arr[k] = leftArray[i];
                i++;
                k++;
            }
            else{
                
                arr[k] = rightArray[j];
                j++;
                k++;

            }
        }
        while(i<size1){
            arr[k] = leftArray[i];
                i++;
                k++;
        }
        while(j<size2){
              arr[k] = rightArray[j];
                j++;
                k++;
        }
    }
}
