import java.util.ArrayList;
import java.util.List;

public class HR_twoStack {
    

    public static void main(String[] args) {

        //List<Integer> an = Arrays.asList(5, 12, 9, 3, 15, 88);
        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(4);
        a.add(6);a.add(1);
        //List<Integer> ab = Arrays.asList(5, 12, 9, 3, 15, 88);
        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(1);b.add(8);b.add(5);
        System.out.println(twoStacks(10, a, b));
     
        


    }
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int suma = 0;
        int sumb = 0, counta=0, countb = 0;
        
        for (int i = 0; i < a.size(); i++) {

            suma= suma+a.get(i);
        }
        for (int i = 0; i < b.size(); i++) {
            sumb +=b.get(i);
            
        }
        for (int i = 0; i < a.size(); i++) {
            if(suma-a.get(i)>=10){

                
                counta++;
                suma = suma-a.get(i);
            }
        }
        for (int i = 0; i < b.size(); i++) {
            if(sumb-b.get(i)>=10){
                
                counta++;
                sumb = sumb-b.get(i);
            }
        }



        return counta ;

    
   }
}
