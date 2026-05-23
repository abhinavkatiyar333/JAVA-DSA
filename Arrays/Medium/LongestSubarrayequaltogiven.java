public class LongestSubarrayequaltogiven {
    public static void main(String[] args) {
        // for only positive value
        // this is variable size window
        int arr[] = {3,2,1,4,1,1,1,0};
        int max = 0;
        int x = 3;
        int j=0;
        int sum =0;
        

        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
            while(sum>x){
                sum = sum-arr[j];
                j++;
            }
            if(sum == x){
              max = Math.max(max, i-j+1);
            }
        }
        System.out.println(max);
        }
    }
    

