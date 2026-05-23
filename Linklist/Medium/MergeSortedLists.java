public class MergeSortedLists {
  // Structure
    static class Node{
        int data;
        Node next;

          Node(int data){
            this.data = data;
            this.next = null;
          }
    }
    public static void main(String[] args) {

        // First list
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);

        // Decond list
        Node head2 = new Node(15);
        head2.next = new Node(25);
        head2.next.next = new Node(35);

        // create dummy node 
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if(head1 != null){
            temp.next = head1;
        }
        if(head2 != null){
            temp.next = head2;
        }

        Node print = dummy.next;
        while(print != null){
            System.out.print(print.data+" ");
            print = print.next;
        }
        
    }
    
}
