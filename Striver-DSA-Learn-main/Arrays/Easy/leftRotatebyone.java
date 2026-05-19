import java.util.*;
public class leftRotatebyone {
          public static void roTate(int arr[],int left,int right){
                    while(left<right){
                              int temp = arr[left];
                              arr[left] = arr[right];
                              arr[right] = temp;
                              left++;
                              right--;
                    }
          }
          public static void main(String[] args) {
                    int arr[] = {1,2,3,4,5,6,7};
                    int d =1;
                    roTate(arr, 0, d-1);
                    roTate(arr, d, arr.length-1);
                    roTate(arr, 0, arr.length-1);
                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }
                    
          }
          
}
