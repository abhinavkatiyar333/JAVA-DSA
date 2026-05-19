import java.util.*;

public class MergeSort1 {
          // Merge function
          public static void merge(int arr[], int left, int mid, int right) {

                    int temp[] = new int[right - left + 1];

                    int i = left;
                    int j = mid + 1;
                    int k = 0;

                    // Compare both parts
                    while (i <= mid && j <= right) {

                              if (arr[i] < arr[j]) {
                                        temp[k] = arr[i];
                                        i++;
                              } else {
                                        temp[k] = arr[j];
                                        j++;
                              }

                              k++;
                    }

                    // Remaining left elements
                    while (i <= mid) {
                              temp[k] = arr[i];
                              i++;
                              k++;
                    }

                    // Remaining right elements
                    while (j <= right) {
                              temp[k] = arr[j];
                              j++;
                              k++;
                    }

                    // Copy temp array to original array
                    for (int x = 0; x < temp.length; x++) {
                              arr[left + x] = temp[x];
                    }
          }

          // Divide function
          public static void divide(int arr[], int left, int right) {

                    if (left >= right) {
                              return;
                    }

                    int mid = (left + right) / 2;

                    divide(arr, left, mid);
                    divide(arr, mid + 1, right);

                    merge(arr, left, mid, right);
          }

          public static void main(String[] args) {

                    int arr[] = { 6, 3, 9, 5, 2, 8 };

                    divide(arr, 0, arr.length - 1);

                    for (int i = 0; i < arr.length; i++) {
                              System.out.print(arr[i] + " ");
                    }
          }
}
