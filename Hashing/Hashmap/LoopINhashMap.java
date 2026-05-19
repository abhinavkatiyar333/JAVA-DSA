import java.util.*;

public class LoopINhashMap {
          public static void main(String[] args) {

                    HashMap<Integer, String> map = new HashMap<>();

                    map.put(1, "A");
                    map.put(2, "B");
                    map.put(3, "C");

                    for (int i = 1; i <= map.size(); i++) {
                              System.out.println(i + " " + map.get(i));
                    }

          }
}
