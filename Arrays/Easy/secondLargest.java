import java.util.*;

public class secondLargest {
          public static void main(String[] args) {
                    int arr[] = { 9, 5, 8, 6, 0, 6, 1 };
                    int largest = Integer.MIN_VALUE;
                    int secondlarg = Integer.MIN_VALUE;

                    for (int i = 0; i < arr.length; i++) {
                              if (arr[i] > largest) {
                                        secondlarg = largest;
                                        largest = arr[i];

                              } else if (arr[i] > secondlarg && arr[i] != largest) {

                                        secondlarg = arr[i];
                              }
                    }
                    System.out.println(secondlarg);

          }

}
