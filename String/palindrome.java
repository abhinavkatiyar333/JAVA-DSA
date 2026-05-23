public class palindrome {
    public static void main(String[] args) {
        boolean ispalindrome = false;
    
    String name = "madam";
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

       String newArr = new String(arr);
       if(name.equals(newArr)){
        ispalindrome = true;
       }
       System.out.println(ispalindrome);

       
        
    }
}
    

