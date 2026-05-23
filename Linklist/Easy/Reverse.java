

public class Reverse {
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

         Node prev = null;

        Node curr = head;

        while(curr != null) {

            Node next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }
          head = prev;

        Node print = head;

        while(print != null) {

            System.out.print(print.data+" ");

            print = print.next;
        }
    }
    
}
