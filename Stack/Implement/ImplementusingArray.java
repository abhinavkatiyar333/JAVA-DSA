
public class ImplementusingArray {
    // Stack using Array

     static class stackArray{
        int arr[] = new int[5];
        int top =-1;
        // push in stack
        void push(int data){
            top++;
            arr[top] = data;
        }
        // pop in stack
        int pop(){
            int val = arr[top];
            top--;
            return val;
        }
        // peek in stack
        int peek(){
            return  arr[top];
        }
        // isempty in stack
        boolean isempty(){
            return top == -1;
        }
     }
    public static void main(String[] args) {
        stackArray st = new stackArray();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.peek());
        
    }
    
}
