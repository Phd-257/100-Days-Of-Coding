import java.util.ArrayList;
import java.util.List;

public class HackerRankSparseArray {
    
    public static void main(String[] args) {
       

        ArrayList<String> arr = new ArrayList<>();
        arr.add("aba");
        arr.add("baba");
        arr.add("aba");
        arr.add("xzxb");
        ArrayList<String> query = new ArrayList<>();
        arr.add("aba");
        arr.add("xzxb");
        arr.add("ab");
       

        
        
        
        int k=0;
        int[] countArray = new int[3];
        String s = String.join(",", arr);

     
        System.out.println(s);



        for (int i = 0; i < query.size(); i++) {
            int count=0;
            for (int index = 0; index < arr.size(); index++) {
                
                if(query.get(i).equals(arr.get(index))){
                    System.out.println(query.get(i).equals(arr.get(index)));
                    count++;
                }

            }
            countArray[k]=count;
            k++;
        }

        for (int i : countArray) {
            System.out.print(i+" ");
        }
    }
}
