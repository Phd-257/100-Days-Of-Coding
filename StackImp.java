public class StackImp {
    
    public static void main(String[] args) {
        
        Stack s =new Stack();
        System.out.println(s.isEmpty());
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.pop()+" "+s.pop()+" "+s.pop());
        System.out.println(s.peek());
        System.out.println("serch "+ s.search(3));
        System.out.println(s.getSize());


        s.display();

        
    }
}

class Stack{

    Node top;
    private int size=0;

    public int getSize() {
        return size;
    }
    public void display(){
        Node currunt = top;

        while(currunt!=null){

            System.out.print(currunt.data+" ");
            currunt = currunt.next;

        }
    }
    public int search(int data){

        int i=1;
        Node curr  = top;

        while(curr!=null){

            if(curr.data == data){
                return i;
            }
            i++;
            curr = curr.next;
        }

        return -1;

    }
   
    public int push(int data){

        Node node = new Node(data);
        if(top == null){
            top = node;
            
        }
        else{
        
        node.next = top;
        top = node;
        
        }
        size+=1;


        return top.data;
    }
    public int pop(){

        Node curruntTop = top;
        top = top.next;
        size -= 1;
        return curruntTop.data;

    }
    public int peek(){

        return top.data;

    }
    public boolean isEmpty(){

        return top==null;
    }

    class Node{

        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }
    }
}
