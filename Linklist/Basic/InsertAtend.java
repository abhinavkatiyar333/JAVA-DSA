public class InsertAtend {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Node
        System.out.println("linkedlist");
         Node print = head;
        while(print !=null){
            System.out.print(print.data+" ");
                  print = print.next;
        }
        System.out.println();


        System.out.println("Insert at start");
        // insert at start

        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;

         Node print1 = head;
        while(print1 !=null){
            System.out.print(print1.data+" ");
                  print1 = print1.next;
        }
        
        System.out.println();

        System.out.println("Insert at last");

        // insert at last

        Node temp = head;
        while(temp.next !=null){
                  temp = temp.next;
        }
        temp.next = new Node(50);
        // print 2nd
         Node print2  = head;
        while(print2 !=null){
            System.out.print(print2.data+" ");
                  print2 = print2.next;
        }
         System.out.println();

       System.out.println("delete first Node ");
        // delete first node
        head = head.next;
        // print 3rd
         Node print3 = head;
        while(print3 !=null){
            System.out.print(print3.data+" ");
                  print3 = print3.next;
        }
        System.out.println();

     System.out.println("Delete last Node");
        // delete last node
        Node delete = head;
        // print 4th
        while(delete.next.next != null){
            delete = delete.next;
        }
        delete.next = null;

         Node print4 = head;
        while(print4 !=null){
            System.out.print(print4.data+" ");
                  print4 = print4.next;
        }
        
    }
    
}
