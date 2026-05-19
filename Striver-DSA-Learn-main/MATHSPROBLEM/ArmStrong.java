public class ArmStrong {
          public static void main(String[] args) {
                    int num = 153;
                    int var = num;
                    int ans = 0;
                    boolean isArmstrong = true;

                    int pow = String.valueOf(num).length();

                    while (num > 0) {
                              int val = num % 10;
                              ans += Math.pow(val, pow);
                              num = num / 10;

                    }
                    if (var != ans) {
                              isArmstrong = false;
                    }
                    System.out.println(isArmstrong);
          }

}
