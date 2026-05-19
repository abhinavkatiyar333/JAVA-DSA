import java.util.*;
public class MoveZeroedTOend {
          public static void main(String[] args) {
                    int arr[] = {0,1,0,2,3,0,5,0,4,4};
                    int k =0;
                    for(int i=0;i<arr.length;i++){
                              if(arr[i] !=0){
                                        arr[k] = arr[i];
                                        k++;
                              }
                    }
                    while(k<arr.length){
                              arr[k] =0;
                              k++;
                    }
                    for(int i=0;i<arr.length;i++){
                              System.out.println(arr[i]);
                    }
          }
          
}
