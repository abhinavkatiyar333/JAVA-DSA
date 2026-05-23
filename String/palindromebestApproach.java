
public class palindromebestApproach {


    public static void main(String[] args) {

        String name = "madam";

        int left = 0;
        int right = name.length() - 1;

        boolean isPalindrome = true;

        while(left < right) {

            if(name.charAt(left) != name.charAt(right)) {

                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}
    

