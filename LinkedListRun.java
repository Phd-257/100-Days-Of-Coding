class LinkedListRun {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.append(2);
        list.append(4);
        list.append(6);
        list.preppend(8);
        list.preppend(10);
        list.deleteByValue(10);
        list.deleteByValue(8);
      
      

        list.printLinkedList();

    }
    
}
class LinkedList{

    Node head;

    public void append(int data){

        if(head==null){
            head = new Node(data);
            return;
            
        }
        Node currunt  = head;

        while(currunt.next!=null){
            currunt = currunt.next;
        }
        currunt.next  = new Node(data);
    }

    public void printLinkedList(){
    
        if(head == null){
            System.out.print("List is Empty");
            return;
        }
        if(head.next==null){
            System.out.print(head.data+" ");
            return;
        }
        Node currunt = head;

        while(currunt!=null){

           
            System.out.print(currunt.data+" ");
            currunt=currunt.next;
            
        }
    }

    public void preppend(int data){
        Node Newhead  = new Node(data);
        Newhead.next = head;
        head = Newhead;
    }

    public void deleteByValue(int data){

        if(head.data==data){
            head = head.next;
            return;
        }
        Node currunt = head;
        while(currunt.next!=null){

            if(currunt.next.data==data){
                currunt.next = currunt.next.next;
            }
            currunt = currunt.next;
        }
    }
}


class Node {

    int data;
    Node next;

   public Node(int data){
       this.data = data;
   }
    
}