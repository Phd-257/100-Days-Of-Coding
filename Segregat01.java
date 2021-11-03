package Arrays;

public class Segregat01 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1,2,2,2,0};
        int count0 = 0;
        int count1=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
                }
            
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<count0){
                arr[i]=0;
            }
            else if((i<count1+count0)){
                arr[i]=1;
            }
            else{
            arr[i]=2;
        }}
      
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
