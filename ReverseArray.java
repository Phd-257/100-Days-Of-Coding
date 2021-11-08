package Arrays;

import java.util.Scanner;



public class ReverseArray {
    
    public static void main(String[] args) {
        

        Scanner sc =new Scanner(System.in);
        String numbers = "";
        
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {

            
            int n= sc.nextInt();
            
            int rotation = sc.nextInt();
            
            int a[] = new int[n];

            for (int j = 0; j < n; j++) {

               
                a[j] = sc.nextInt();
                
            }

            
            

           

            int ans=0;
            if(rotation>(n-1)){

                rotation = rotation%(n);
            }

            for(int j = rotation;j<n;j++){

                numbers = numbers+ a[j]+" ";
    
            }
            for (int k = 0; k < rotation; k++) {
                numbers = numbers+a[k]+" ";
            }
            numbers = numbers+"End";

        }

        String [] parts = numbers.split("End");

        for (int i = 0; i < testCase; i++) {
            System.out.println(parts[i]);
        }
        

       
        
        sc.close();


    }
}
