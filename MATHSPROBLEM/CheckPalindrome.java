public class CheckPalindrome {
          public static void main(String[] args) {
                    int num = 12321;
                    int n = num;
                    boolean check = true;

                    int ans = 0;

                    while (num > 0) {
                              int val = num % 10;
                              ans = ans * 10 + val;
                              num = num / 10;

                    }

                    if (n != ans) {
                              check = false;
                    }

                    System.out.println(check);
          }

}
