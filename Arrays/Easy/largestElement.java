import java.util.*;

public class largestElement {
          public static void main(String[] args) {
                    int arr[] = { 6, 4, 8, 2, 1, 0 };
                    int max = Integer.MIN_VALUE;
                    for (int i = 0; i < arr.length; i++) {
                              if (arr[i] > max) {
                                        max = arr[i];
                              }
                    }
                    System.out.println("Largest value = " + max);
          }

}
