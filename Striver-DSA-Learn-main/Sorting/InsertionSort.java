import java.util.*;
public class InsertionSort {
          public static void main(String[] args) {
                    int arr[] = {7,3,2,1,0,9,44};

                    for(int i=0;i<arr.length;i++){
                              int j=i;
                              while (j>0 && arr[j-1] > arr[j]) {
                                        int temp = arr[j-1];
                                        arr[j-1] = arr[j];
                                        arr[j] = temp;
                                        j--;
                                        
                              }
                    }
                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }
          }
          
}
