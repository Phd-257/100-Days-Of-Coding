package Hundred_Days_Of_Code;

public class ZeroAtTheEnd {

    public static void main(String[] args) {
        
        int[] arr  = {1,0,0,4};
        int LastZero = 0;
        for (int i = 0; i < arr.length-1; i++) {
           
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[LastZero];
                arr[LastZero] = temp;
                LastZero++;
            }
            
            
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
