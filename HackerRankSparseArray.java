import java.util.ArrayList;
import java.util.List;

public class HackerRankSparseArray {
    
    public static void main(String[] args) {
       

        ArrayList<String> strings = new ArrayList<>();
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");
        ArrayList<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
        
  
        ArrayList<Integer> countArray= new ArrayList<>();
        

        for (int i = 0; i < queries.size(); i++) {
            int count=0;
            for (int index = 0; index < strings.size(); index++) {
                
                //System.out.println(query.get(i)==arr.get(index)+ " "+ query.get(i)+" "+arr.get(index));
                if(queries.get(i)==strings.get(index)){
                    
                    count++;
                }

            }
            countArray.add(count);
           
        }

        for (int i : countArray) {
            System.out.print(i+" ");
        }
    }
}
