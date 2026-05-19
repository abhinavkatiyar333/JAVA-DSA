import java.util.*;

public class MergeSort2 {
          public static void merge(int arr[], int left, int mid, int right) {

                    int temp[] = new int[right - left + 1];
                    int i = left;
                    int j = mid + 1;
                    int k = 0;

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
                    while (i <= mid) {
                              temp[k] = arr[i];
                              i++;
                              k++;
                    }
                    while (j <= right) {
                              temp[k] = arr[j];
                              j++;
                              k++;
                    }
                    // Copy temp back to original array
                    for (int p = 0; p < temp.length; p++) {
                              arr[left + p] = temp[p];
                    }
          }

          

          public static void Devide(int arr[], int left, int right) {
                    System.out.println();
                    if (left >= right) {
                              return;
                    }
                    int mid = (right + left) / 2;
                    Devide(arr, left, mid);
                    Devide(arr, mid + 1, right);
                    merge(arr, left, mid, right);
          }

          public static void main(String[] args) {
                    int arr[] = { 9, 6, 2, 1, 8, 0, 7, 6 };
                    Devide(arr, 0, arr.length - 1);
                    for (int i = 0; i < arr.length; i++) {
                              System.out.print(arr[i] + " ");
                    }

          }

}
