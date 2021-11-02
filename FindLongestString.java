package Arrays;

public class FindLongestString {


    public static void main(String[] args) {


        String s[] = { "Geek", "Geeks", "Geeksfor",
        "GeeksforGeek", "GeeksforGeeks" };
        

        FindLongestString f = new FindLongestString();
        System.out.println(f.longest(s, 5));
    
}

    public String longest(String names[], int n) {
        String logA="";
    

       for (int i = 0; i < names.length; i++) {
           if(names[i].length()>=logA.length()){
               logA=names[i];
           }
       }
            
    

        return logA;
    
        
    }


}
