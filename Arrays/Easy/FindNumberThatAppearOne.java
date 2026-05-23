public class FindNumberThatAppearOne {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,4,3,1};
        int x =0;
       

        for(int i=0;i<arr.length;i++){
            x = arr[i]^x;
        }
        System.out.println(x);
    }
    
    
}
