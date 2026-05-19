import java.util.*;

public class SumofFirstnNumber {
          public static int Print(int n) {
                    int sum = 0;
                    if (n == 0) {
                              return 0;
                    } else {

                              sum += n + Print(n - 1);
                    }
                    return sum;
          }

          public static void main(String[] args) {
                    int n = 5;
                    System.out.println(Print(n));
          }

}
