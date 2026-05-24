import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "({[]})";

        Stack<Character> st = new Stack<>();

        boolean valid = true;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // opening brackets
            if(ch == '(' || ch == '{' || ch == '[') {

                st.push(ch);
            }

            // closing brackets
            else {

                if(st.isEmpty()) {

                    valid = false;
                    break;
                }

                char top = st.peek();

                if(
                    (ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')
                ) {

                    st.pop();

                } else {

                    valid = false;
                    break;
                }
            }
        }

        // leftover opening brackets
        if(!st.isEmpty()) {

            valid = false;
        }

        System.out.println(valid);
    }
}