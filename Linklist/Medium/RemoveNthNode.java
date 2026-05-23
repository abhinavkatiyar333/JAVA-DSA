
public class RemoveNthNode {
     static class Node {

        int data;
        Node next;

        Node(int data){

            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int n = 1;
        int count =0;

        // create LL

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
         // delete Nth element
         // 1 count

      Node temp = head;
      while(temp !=null){
           count+=1;
           

           if(n == count){
               temp.next = temp.next.next;
           }
            temp = temp.next;
      }

      Node print = head;
      while(print != null){
        System.out.println(print.data);
        print = print.next;
      }

     

      

    }
}

