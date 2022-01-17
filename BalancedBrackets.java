import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
    }

    public static String isBalanced(String s) {
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            
            
            
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(' ){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')' ){
                if(s.charAt(i) == '}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }
                }
                if(s.charAt(i) == ']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                }
                if(s.charAt(i) == ')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                }
                
            }
            
            
        }
        
        if(stack.empty()){
            return "YESN";
        }
    
        return "NON";
        }
}
