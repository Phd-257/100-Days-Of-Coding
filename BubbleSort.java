package Hundred_Days_Of_Code;

public class BubbleSort {

    public static void main(String[] args) {
        
        int[] arr = {20,10,40,30,50};

        for (int i = 0; i < arr.length-1; i++) {
            boolean check = true;
            
            for (int j = 0; j < arr.length-1-i; j++) {

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check=false;
                }
                
            }
            if(check){
                System.out.println("Already Sorted.");
               break;
            }
        }
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
    
}
