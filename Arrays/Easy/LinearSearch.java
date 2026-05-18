import java.util.*;
public class LinearSearch {
          public static void main(String[] args) {
                    int arr[] = {7,5,6,2,8,2,0};
                    int d =6;
                    boolean found = false;

                    for(int i=0;i<arr.length;i++){
                              if(arr[i]==d){
                                        System.out.println("element at index = "+ i);
                                        found = true;
                                        break;
                              }
                    }
                   

                    System.out.println(found);
          }
          
}
