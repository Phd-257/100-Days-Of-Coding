public class LeetCodeReverseString {
    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }

    private static void reverseString(char[] s) {
        
        
        int i=0,j=s.length-1;
        while(i<=j){
            
            char temp = s[i];
            s[i] = s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
