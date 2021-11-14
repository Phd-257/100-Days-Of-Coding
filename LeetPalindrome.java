package Hundred_Days_Of_Code;

public class LeetPalindrome {
    
    public static void main(String[] args) {
        int k = -121;
        boolean check = true;

        String s  = String.valueOf(k);

        int i=0;
        int j= s.length()-1;

        while(i<=j){

            if(s.charAt(i)!= s.charAt(j)){
                check = false;
                break;
            }
           
            i++;
            j--;

        }

        System.out.println(check);


        
        
    }
}
