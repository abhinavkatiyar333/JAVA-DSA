public class Reverse {
    public static void main(String[] args) {
        String name = "abhinav";
        int left = 0;
        int right = name.length()-1;
        char arr[] = name.toCharArray();

       while(left<=right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
       }

       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
        
    }
    
}
