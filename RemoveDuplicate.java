package Hundred_Days_Of_Code;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int n[] = {1,1,2,2,3};


        int k=0;
      

        for (int i = 0; i < n.length; i++) {
            if(n[k]!=n[i]){
                n[++k]=n[i];
               
            }
            else{
                continue;
            }
            
        }
        System.out.println(k);
    }
    
}
