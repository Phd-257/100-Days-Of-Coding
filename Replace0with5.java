package Arrays;

public class Replace0with5 {

    public static void main(String[] args) {
        

        int n = 121;
        
        String s= String.valueOf(n);


        s.replace('0', '5');

        n = Integer.parseInt(s);

    
    }
    
}
