import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {

        int arr[] = {2,1,3,4};

        int ans[] = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--) {

            // remove smaller elements
            while(!st.isEmpty() && st.peek() <= arr[i]) {

                st.pop();
            }

            // next greater
            if(st.isEmpty()) {

                ans[i] = -1;

            } else {

                ans[i] = st.peek();
            }

            // push current element
            st.push(arr[i]);
        }

        for(int x : ans) {

            System.out.print(x + " ");
        }
    }
}