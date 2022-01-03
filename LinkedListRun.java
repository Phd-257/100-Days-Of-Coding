class LinkedListRun {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.append(3);
        list.append(4);
        list.append(5);
        list.preppend(2);
        list.preppend(1);
        list.deleteByPosition(0);
        
        System.out.println("lenght: "+list.getLenght());
      
      

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
    public int getLenght(){
        
        if(head==null){
           return 0;  
        }
        Node currunt=head;
        int i= 0;
        while(currunt!=null){
            
            currunt=currunt.next;
            i++;
        }
        return i;
        

    }

    public void deleteByPosition(int position){
        position = position-1;
        if(position>=getLenght()|| position<1){
            System.out.println("Error");
            return;
        }
        
        if(position == 0){
            head = head.next;
            return;
        }
        if(position==1){
            head.next=head.next.next;
            return;
        }
         int i=0;
         Node currunt = head;

         while(i<position-1){
            currunt = currunt.next;
             i++;
         }
         currunt.next = currunt.next.next;

    }
}



class Node {

    int data;
    Node next;

   public Node(int data){
       this.data = data;
   }
    
}