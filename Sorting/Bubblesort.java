import java.util.*;

public class Bubblesort {
          // campare element and swap max element with adjacent
          public static void main(String[] args) {
                    int arr[] = { 6, 3, 8, 3, 0, 2 };

                    for (int i = 0; i < arr.length; i++) {
                              for (int j = 0; j < arr.length - 1; j++) {
                                        if (arr[j] > arr[j + 1]) {
                                                  int temp = arr[j];
                                                  arr[j] = arr[j + 1];
                                                  arr[j + 1] = temp;
                                        }
                              }
                    }

                    for (int i = 0; i < arr.length; i++) {
                              System.out.print(arr[i] + " ");
                    }
          }

}
