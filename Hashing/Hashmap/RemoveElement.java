import java.util.*;


public class RemoveElement {
           public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");

        map.remove(1);

        System.out.println(map);
    }
          
}
