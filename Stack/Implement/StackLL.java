public class StackLL {

    static class Node {

        int data;
        Node next;

        Node(int data){

            this.data = data;
        }
    }

    static class Stack {

        Node top = null;

        // push
        void push(int data){

            Node newNode = new Node(data);

            newNode.next = top;

            top = newNode;
        }

        // pop
        int pop(){

            int val = top.data;

            top = top.next;

            return val;
        }

        // peek
        int peek(){

            return top.data;
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);

        st.push(20);

        st.push(30);

        System.out.println(st.peek());

        System.out.println(st.pop());

        System.out.println(st.peek());
    }
}