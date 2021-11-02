package Arrays;

import java.util.Arrays;

public class ExceptionallyOdd {
    
    public static void main(String[] args) {
        

        int arr[]  = {1,2,2,1,3,3,3};
        int count=0;
        boolean[] check = new boolean[arr.length]; 

       


        for (int i = 0; i < arr.length; i++) {
            
            if(i==arr.length){

                if (check[i]==false){

                    System.out.println(arr[i]);
                    break;
                   

                }
            }
        
            for (int j = i+1; j < arr.length; j++) {
               if(arr[i]==arr[j] && check[i]==false && count!=1){
                   check[i]= true;
                   check[j]= true;
                    count++;
               }
                    
            }
        
            count=0;
           
        }
        for (int i = 0; i < check.length; i++) {
            if(check[i]==false){
                System.out.println(arr[i]);
            }
        }
       
    }
}
