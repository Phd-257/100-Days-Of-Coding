public class QueueImp {

    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
       
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.element());
        System.out.println("size "+q.getSize());
        
        
    
        
        q.display();

    }
    
}

class Queue{

    private Node head=null;
    private Node tail=null;
    private int size=0;

    public int getSize() {
        return size;
    }

    public boolean add(int data){
       
        Node node = new Node(data);
        if(head ==null){
            head =tail= node;
        } 
           
            tail.next = node;
            
            tail= node;
            size+=1;
            return true;
       

    }
    public int remove(){
        
    
        Node curruntHead = head;
        head = head.next;
        size -=1;
        return curruntHead.data;
        
        
    }

    public int element(){

        return head.data;
    }

    public boolean isEmpty(){
        return head==null;
    }
    public void display(){
        Node currunt = head;

        while(currunt!=null){
            System.out.print(currunt.data+" ");
            currunt = currunt.next;
        }
    }

    class Node{

        Node next;
        int data;

        private Node(int data){
            this.data = data;
        }
    }
}
