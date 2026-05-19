
class printValueNtimes {
          public static void Print(int n) {
                    if (n == 0) {
                              return;

                    } else {
                              System.out.println(n);
                              Print(n - 1);
                    }

          }

          public static void main(String[] args) {
                    int n = 10;
                    Print(n);

          }

}