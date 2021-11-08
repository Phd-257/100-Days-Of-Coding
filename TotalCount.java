package Arrays;

public class TotalCount {

    public static void main(String[] args) {
        
            int[] a = {5,8,10,13};

            int k = 3;

            int count = 0;

            for (int i = 0; i < a.length; i++) {

                count = count+ a[i]/k;
                if(a[i]%k>0){
                    count++;
                }
              
                
            }
            System.out.println(count);

    }
    
}
