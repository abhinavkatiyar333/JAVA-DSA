public class reverseAnumber {
          public static void main(String[] args) {
                    int num = 123456;

                    int ans = 0;

                    while(num>0){
                              int val = num%10;
                               ans = ans*10+val;
                               num = num/10;

                    }
                    System.out.println(ans);

          }
          
}
