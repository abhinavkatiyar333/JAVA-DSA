import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,85};
        Stack<Integer> st = new Stack<>();
        int span[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i- st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]);
        }
    }
    
}
