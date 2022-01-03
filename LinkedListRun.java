class LinkedListRun {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        
        //list.deleteByPosition(1);
        list.add(6, 5);
        

        
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
        
        if(position>getLenght()-1|| position<0){
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
    public void add(int data, int position){

        if(position==0){
            preppend(data);
            return;
        }
        if(position==getLenght()){
            append(data);
            return;
        }
        if(position>getLenght()-1){
            System.out.println("Errror length is "+getLenght());
            return;
        }
        if(position==1){
            Node tempNode = head.next;
            head.next = new Node(data);
            head.next.next = tempNode;
            return;
        }
        Node currunt  = head;
        int i=0;

        while(i<position-1){
            currunt=currunt.next;
            i++;
        }
        Node temp = currunt.next;
        currunt.next = new Node(data);
        currunt.next.next = temp;
    }

}



class Node {

    int data;
    Node next;

   public Node(int data){
       this.data = data;
   }
    
}