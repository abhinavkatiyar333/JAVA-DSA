public class UpperBound {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,8,9};
        int target = 5;
        int ans =arr.length;

        int left =0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (right+left)/2;
            if(arr[mid]>target){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println(ans);
    }
    
}
