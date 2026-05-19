public class primenumber {
          public static void main(String[] args) {
                    int num = 13;
                    boolean isprime = true;
                    for(int i=2;i<num;i++){
                              if(num%i==0){
                                        isprime = false;
                              }
                    }
                    System.out.println(isprime);
          }
          
}
