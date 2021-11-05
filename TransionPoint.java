package Arrays;

public class TransionPoint {
    public static void main(String[] args) {
        

        int[] arr= {0,0,0,0,1,1,1};
        int ans = 0;
        if(arr[arr.length-1]==0|| arr[0]==1){
            ans = -1;
        }
        else{

        for (int i = 0; i < arr.length; i=i+2) {
            
            if(arr[i]==1){
                if(arr[i-1]==1){
                    
                    ans = (i-2)+1;
                    break;
                }
                else if(arr[i-1]==0){
                    ans = (i-1)+1;
                    break;
                }
            }
            else{
                ans = arr.length-1;
            }
        }
        System.out.println(ans+"  ");

    }
}
    
}
