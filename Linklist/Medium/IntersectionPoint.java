public class Intersectionpoint {
     static class Node {

        int data;
        Node next;

        Node(int data){

            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // common part
        Node common = new Node(50);

        common.next = new Node(60);

        // first list
        Node head1 = new Node(10);

        head1.next = new Node(20);

        head1.next.next = new Node(30);

        head1.next.next.next = common;

        // second list
        Node head2 = new Node(15);

        head2.next = new Node(25);

        head2.next.next = common;

        Node p1 = head1;

        Node p2 = head2;

        while(p1 != p2){

            if(p1 == null){

                p1 = head2;

            } else {

                p1 = p1.next;
            }

            if(p2 == null){

                p2 = head1;

            } else {

                p2 = p2.next;
            }
        }

        System.out.println(p1.data);
    }
    
}
