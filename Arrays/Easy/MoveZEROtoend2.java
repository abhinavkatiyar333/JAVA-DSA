import java.util.*;
public class MoveZEROtoend2 {
          public static void main(String[] args) {
                    int arr[] = {0,1,0,2,3,0,5,0,4,4};
                    int k =0;

                    for(int i=0;i<arr.length;i++){
                              if(arr[i] !=0){
                                        int temp = arr[i];
                                        arr[i] = arr[k];
                                        arr[k] = temp;
                                        k++;
                              }
                    }
                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }
          }
          
}
