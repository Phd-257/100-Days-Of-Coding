package Hundred_Days_Of_Code;

import java.util.Scanner;

public class MinMax {
    
    public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCases =  sc.nextInt();
        int maxM[]= new int[testCases];
        int minM[]=new int [testCases];



        for (int k = 0; k<testCases ; k++) {
            
    
		int sizeOfAnArray = sc.nextInt();
		int a[] = new int[sizeOfAnArray];
        

		for(int i=0;i<a.length;i++){
		    
        
		    a[i] = sc.nextInt();
		    
		}
        minM[k]=a[0];
        maxM[k]=a[0];
       
        
        for(int i=0;i<a.length;i++){
            
            
		    if(a[i]>=maxM[k]){
		        maxM[k]=a[i];
		    }
		
        }
        for (int i = 0; i < a.length; i++) {
           
            if(a[i]<=minM[k]){
		        minM[k]=a[i];
		    }
            
        }
      
    }

    for (int i = 0; i < testCases; i++) {
        
        System.out.println(maxM[i]+" "+minM[i]);
    }
}

	}
