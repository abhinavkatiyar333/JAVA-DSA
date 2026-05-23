public class FindMiddleElement {
       
    static class Node{
        int data;
        Node next;

          Node(int data){
            this.data = data;
            this.next = null;
          }
    }


    public static void main(String[] args) {
        Node head = new Node(10);
         head.next = new Node (20);
         head.next.next = new Node (30);
         head.next.next.next = new Node(40);
         head.next.next.next.next = new Node(50);

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            // fast != null && fast.next != null both run when value of fast and fast.next exists
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

        
    }
    
}
