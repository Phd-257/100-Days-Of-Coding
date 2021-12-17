import java.util.ArrayList;
import java.util.List;

public class HackerRankReverse {
    
    public static void main(String[] args) {
        
        List<Integer> s = new ArrayList<>();

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        for (int i : s) {
            System.out.println(i);
        }


        s=reverseArray(s);
        for (int i : s) {
            System.out.println(i);
        }

    }
    public static List<Integer> reverseArray(List<Integer> a) {
   
        int j=0;
        List<Integer> ans = new ArrayList<>();
        
        for(int i=a.size()-1;i>=0;i--){
            
            ans.add(a.get(i));
            j++;
        }
        return ans;

    }
}
