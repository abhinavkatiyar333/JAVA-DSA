import java.util.*;

public class PracticenextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4};
        int newarr[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                newarr[i] = -1;
            }else{
                newarr[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
    
}
