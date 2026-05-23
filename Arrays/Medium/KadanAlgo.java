public class KadanAlgo {
    public static void main(String[] args) {
        // Maximum Sum Subarray
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxsum = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxsum = Math.max(sum, maxsum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxsum);
        
    }
    
}
