public class majorityElement {
    public static void main(String[] args) {
        // that ekement appear more than n/2 in array
        int arr[] = {2,2,1,1,1,2,2};
        
             int count = 0;
              int candidate = 0;

        for(int i = 0; i < arr.length; i++) {

            if(count == 0) {
                candidate = arr[i];
            }

            if(arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);

        }
    }
    

