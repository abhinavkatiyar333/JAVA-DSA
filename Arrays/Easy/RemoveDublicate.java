import java.util.*;

public class RemoveDublicate {
          public static void main(String[] args) {

                    int arr[] = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };
                    int k = 1;

                    for (int i = 1; i < arr.length; i++) {
                              if (arr[i - 1] != arr[i]) {
                                        arr[k] = arr[i];
                                        k++;
                              }
                    }
                    for (int i = 0; i < k; i++) {
                              System.out.print(arr[i]);
                    }

          }
}
