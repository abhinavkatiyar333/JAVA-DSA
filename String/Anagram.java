
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String name1 = "Abhinav";
        String name2 = "navabhi";

      name1 =  name1.toLowerCase();
      name2 =  name2.toLowerCase();

        boolean isAnagram = false;

        if(name1.length() != name2.length()){
            System.out.println(isAnagram);
            return ;
        }
        char arr1[] = name1.toCharArray();
        char arr2[] = name2.toCharArray();

        Arrays.sort(arr1);
         Arrays.sort(arr2);

         if(Arrays.equals(arr1, arr2)){
            isAnagram = true;
         }

         System.out.println(isAnagram);




    }
    
}
