public class maxSumofsubarraywithFixsize {
    public static void main(String[] args) {
        // fix size window
        int arr[] = {2,5,3,7,3,7};
        int sum =0;
        int maxsum =0;
        int size =4;
         // create window
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        maxsum = sum;
        // slide window
        for(int i=size;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-size];
            maxsum = Math.max(sum, maxsum);
        }
        System.out.println(maxsum);


    }
    
}
