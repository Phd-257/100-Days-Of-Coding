package Hundred_Days_Of_Code;

// Given two sorted arrays arr1[] and arr2[] of sizes n 
//and m in non-decreasing order. Merge them in 
//sorted order without using any extra space. Modify arr1 
//so that it contains the first N elements and modify arr2 
//so that it contains the last M elements. 
 

// Example 1:

// Input: 
// n = 4, arr1[] = [1 3 5 7] 
// m = 5, arr2[] = [0 2 6 8 9]
// Output: 
// arr1[] = [0 1 2 3]
// arr2[] = [5 6 7 8 9]
// Explanation:
// After merging the two 
// non-decreasing arrays, we get, 
// 0 1 2 3 5 6 7 8 9.

public class MergeWoExtraSpace {
    static String s= " ";
        

    public static void main(String[] args) {
        int arr1[] ={1 ,3 ,5, 7} ;
        int arr2[] ={0 ,2 ,6 ,8 ,9};


       
        
        merge(arr1, arr2);
        // for (int i : arr1) {
        //     System.out.print(i+" ");
        // }
        // for (int i : arr2) {
        //     System.out.print(i+" ");
        // }
        

        for(int i=0; i<arr1.length; i++) {
            //arr1[i] = Integer.parseInt(s.charAt(i));
         }
        
    }

    private static void merge(int arr1[], int arr2[]){

        
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                
               
                System.out.print(arr1[i]+" ");
                k++;
                i++;
            }
            else{

                
               System.out.print(arr2[j]+" ");
                k++;
                j++;
            }
        }
            while(i<arr1.length){

                
           
               System.out.print(arr1[i]+" ");
                k++;
                i++;
            }
            while(j<arr2.length){
               
                System.out.print(arr2[j]+" ");
                k++;
                j++;
            }
        }

    }
    

