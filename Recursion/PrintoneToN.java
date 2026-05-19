import java.util.*;

public class PrintoneToN {
          public static void print(int n, int var) {
                    if (n < var) {
                              return;
                    } else {
                              System.out.println(var);
                              print(n, var + 1);
                    }
          }

          public static void main(String[] args) {
                    int n = 10;
                    int var = 1;
                    print(n, var);
          }

}
