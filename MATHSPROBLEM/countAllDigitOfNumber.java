import java.util.*;
public class countAllDigitOfNumber {
          public static void main(String[] args) {
                    int Digit = 323222;
                    int count = 0;

                    while(Digit>0){
                          Digit = Digit/10;
                          count++;
                    }
                    System.out.println(count);
          }

          
}