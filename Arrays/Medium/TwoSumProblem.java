public class TwoSumProblem {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int sum =0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i]+arr[j];
                if(sum==target){
                    System.out.println(i+","+j);
                    return;
                }
            }

        }
    }
    
}
