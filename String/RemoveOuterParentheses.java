public class RemoveOuterParentheses {

    public static void main(String[] args) {

        String s = "(()())(())";

        String ans = "";

        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // opening bracket
            if(ch == '(') {

                if(count > 0) {
                    ans += ch;
                }

                count++;
            }

            // closing bracket
            else {

                count--;

                if(count > 0) {
                    ans += ch;
                }
            }
        }

        System.out.println(ans);
    }
}