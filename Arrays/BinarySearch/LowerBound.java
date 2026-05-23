public class LowerBound {
    public static void main(String[] args) {
        // first element where value >= target
        int arr[] = {0,1,3,4,6,7};
        int target = 5;
        int left = 0;
        int right = arr.length-1;
        int ans = 0;

        while(left <=right){
            int mid = (right+left)/2;

            if(arr[mid]>=target){
                ans = mid;
                right = mid-1;
            }else{       
                    left = mid+1;      
            }

        }
        System.out.println(ans);



    }
    
}
