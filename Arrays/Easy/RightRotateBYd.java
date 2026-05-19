import java.util.*;

public class RightRotateBYd {
          public static void RotateRight(int arr[], int left, int right) {

                    while (left < right) {
                              int temp = arr[left];
                              arr[left] = arr[right];
                              arr[right] = temp;
                              left++;
                              right--;

                    }
          }

          public static void main(String[] args) {
                    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                    int n = arr.length - 1;
                    int d = 3;
                    RotateRight(arr, 0, n);// Reverse whole array

                    RotateRight(arr, 0, d - 1);// then reverse first d element
                    RotateRight(arr, d, n);// then reverse remaining D element
                    for (int i = 0; i < arr.length; i++) {
                              System.out.print(arr[i] + " ");
                    }
          }

}
