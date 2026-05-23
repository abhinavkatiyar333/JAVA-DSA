public class Sortanarray012 {
    public static void main(String[] args) {
        int arr[] = {1,0,2,1,0,2};
        int j=0;
        int k= arr.length-1;
        
        for(int i=0;i<k;i++){
            if(arr[i]==0){
                 int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }else if(arr[i]==2){
               int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
                i--;
            }
           
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
}
    
}
