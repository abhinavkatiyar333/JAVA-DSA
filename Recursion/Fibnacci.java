import java.util.*;


class Fibnacci {
          public static int fibna(int n){
                    
                    if(n<=1){
                              return n;
                    }else{
                             return fibna(n-1) + fibna(n-2);
                    
                              

                    }
                    
          }
          public static void main(String[] args) {
                    int n =5;
                    System.out.println(fibna(n));
                    
          }

          
}