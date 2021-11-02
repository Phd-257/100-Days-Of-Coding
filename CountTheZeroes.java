package Arrays;

public class CountTheZeroes {
    public static void main(String[] args) {
        
       int arr[] ={1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}
       ;
       int ans = 0;
      
       if(arr[0]==0){
            System.out.print(arr.length);
        
       }
       else {
       for (int i = 0; i < arr.length; i=i+2) {
           
            
           if(arr[i]==0){
           if(arr[i-1]==0){
         
                ans = arr.length-(i-1);
                break;

           }
           else{
                ans = arr.length-i;
                break;
           }
          
           
        }
        
       }
       if(ans==0&& arr[arr.length-1]==0){
           ans = 1;
       }
       else{
       System.out.println(ans+ " ");
       }
    }
}
}
