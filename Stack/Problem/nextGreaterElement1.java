
import java.util.Stack;

public class nextGreaterElement1 {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4};
        int ans [] = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for(int i= arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);


        }
    
}
    
}
