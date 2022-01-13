import java.util.Scanner;

public class TreeImp {

    static Scanner sc= null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
         createNode();
    }

    static Node1 createNode(){

        Node1 root = null;
        System.out.println("Enter a data: ");
        int data =  sc.nextInt();

        if(data == -1) return null;

        root = new Node1(data);

        System.out.println("Enter data to left to "+root.data);

        root.left = createNode();
        
        System.out.println("Enter data to right to "+root.data);

        root.right = createNode();

        return root;
    }
    
}




class Node1{

    Node1 left;
    Node1 right;
    int data;

    public Node1(int data){
        this.data = data;
    }
}
