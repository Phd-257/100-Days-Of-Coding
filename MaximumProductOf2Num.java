package Hundred_Days_Of_Code;

//Given an array Arr of size N 
//with all elements greater than or equal to zero. 
//Return the maximum product of two numbers possible.
// Example 1:
// Input: 
// N = 6
// Arr[] = {1, 4, 3, 6, 7, 0}  
// Output: 42

public class MaximumProductOf2Num {
    
    public static void main(String[] args) {
        
        
        

        int[] arr = {1,100,42,6,7};
        int max=Integer.MIN_VALUE;
        int maxMinus=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]>max){
                maxMinus=max;
                max=arr[i];
            }
            if(arr[i]!=max && arr[i]>maxMinus){
                    maxMinus= arr[i]; 
                
            }
        }

        System.out.print(maxMinus*max+" ");
    }
}
