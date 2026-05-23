public class searchElementinSortedArray {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,5,6,8,9};
        int target = 6;

        int left =0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (right+left)/2;

            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }else{
                 if(arr[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
            }           
        }
       
    }
    
}
