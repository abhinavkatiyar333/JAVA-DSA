public class Longestcommonprefix {
    public static void main(String[] args) {
        

   

        String arr[] = {"flower","flow","flight"};

        String first = arr[0];

        String ans = "";

        for(int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for(int j = 1; j < arr.length; j++) {

                // check boundary and mismatch
                if(i >= arr[j].length() || arr[j].charAt(i) != ch) {

                    System.out.println(ans);
                    return;
                }
            }

            ans += ch;
        }

        System.out.println(ans);
    }
}
     

