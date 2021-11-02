package Hundred_Days_Of_Code;

import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        
        int testCases = sc.nextInt();

        while(testCases>0){
       
        int sizeOfAnArray = sc.nextInt();
        
        int[] arr= new int[sizeOfAnArray];
        for (int i = 0; i < sizeOfAnArray; i++) {

            
            arr[i]= sc.nextInt();
            
        }
        
        

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        testCases--;
 
    }


    }
    
}
