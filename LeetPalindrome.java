package Hundred_Days_Of_Code;

public class LeetPalindrome {
    
    public static void main(String[] args) {
        int s = 121;
        boolean answer = false;
        String ans = "";
        int x = s;
        String j = String.valueOf(s);
        
        

        if(x<0){
            System.out.println(answer+"  sorry");
        }
    

        else{
            for (int i = 0; i < j.length(); i++) {
                
                ans = ans+String.valueOf(x%10);
                x= x/10;
            }
            System.out.println(ans);

            if(Integer.parseInt(ans)==s){
                System.out.println("True !");
            }
            else{
                System.out.println("False");
            }


        }
    }
}
