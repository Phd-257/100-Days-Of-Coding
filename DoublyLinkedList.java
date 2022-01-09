import java.util.Currency;

class DoublyLinkedList {
    
    public static void main(String[] args) {
        
        Dll dll = new Dll();
     
        dll.preAppend(4);
        dll.preAppend(3);
        dll.preAppend(2);
        dll.preAppend(1);
        dll.preAppend(10);
        dll.preAppend(20);
        dll.append(30);
        dll.add(100, 2);
        dll.remove(7);
       
        //System.out.println("\ntail = "+dll.tail.value);
        
        
        dll.printLL();

        System.out.println("\nsize = "+dll.getSize());

       
        
    }
}

class Dll{

    private int size = 1;
    private Node head;
    private Node tail;

    public int getSize() {
        return size;
    }


    public void preAppend(int value){

        Node temp  = new Node(value);
        if(head == null){
            head = temp;
            tail = temp;
            return;
        }
       
        temp.next=head;
        head.prev = temp;
        head= temp;
        size +=1;
    }

    public void append(int value){
        Node temp = new Node(value);

        if(tail == null){
            head = temp;
            tail= temp;
            return;
        }
        
        temp.prev = tail;
        tail.next = temp;
        tail = temp;
        size += 1;

    }

    public void add(int value, int position){

        Node temp = new Node(value);
        if(position == 0){
            preAppend(value);
            return;
        }
        if(position == getSize()){
            append(value);
            return;
        }
        if(position==1){    
            temp.next = head.next;
            head.next.prev = temp;
            temp.prev = head;
            head.next = temp;
            size+=1;
            return;

        }
        
        Node currunt = head;
        int i=0;

        while(i<position-1){

            currunt=currunt.next;
            i++;
        }
        temp.next = currunt.next;
        currunt.next.prev =temp;
        temp.prev = currunt;
        currunt.next = temp; 
        size+=1;    
    }

    public void printLL(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        Node currunt = head;
    
        while(currunt!=null){

            System.out.print(currunt.value+" ");
            currunt = currunt.next;

        }

        
    }
    public void remove(int position){

        if(position>=size || position<0){
            System.out.println("Null Pointer error");
            return;
        }

        if(position==0){
            head.next.prev = null;
            head = head.next;
            size -= 1;
            return;
        }
        if(position==1){
            head.next.next.prev = head;
            head.next = head.next.next;
            size-=1;
            return;
        }
        if (position==(size-1)){
            
            tail.prev.next = null;
            tail= tail.prev ;
            size=size-1;
            return;
        }

        Node currunt = head;
        int i=0;

        while(i<position-1){

            currunt=currunt.next;
            i++;

        }
        currunt.next.next.prev = currunt;
        currunt.next = currunt.next.next;
        size-=1;
    }


    
    private class Node{

        int value;
        Node next;
        Node prev;

        public Node(int value){

            this.value = value;
        }

    }
}

