import java.util.HashMap;
import java.util.HashSet;

public class LeetCode_FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("dddccdbba"));
        
    }
    private static int firstUniqChar(String s) {
        
        HashMap<Character,Integer> has = new HashMap<>(); 
        
        for (int i = 0; i < s.length(); i++) {
  
            if(has.containsKey(s.charAt(i))){
                
                has.put(s.charAt(i),-1);
                
                
            }
             if(!has.containsKey(s.charAt(i))){
                
                has.put(s.charAt(i),i);
                
                
            }
             
        }

        for (int i = 0; i < s.length(); i++) {
            
            if( has.get(s.charAt(i))!=-1){

                return i;
            }
                
        }


        return -1;
    }
    
}
