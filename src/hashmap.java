import javax.crypto.spec.PSource;
import java.util.*;
public class hashmap {

    public static void main(String[] args) {
  HashMap<String,Integer> map = new HashMap<>();

  //inserstion
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        //print
        System.out.println(map);

        // search
        System.out.println(map.containsKey("A"));

        // get
        System.out.println(map.get("B"));
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        Set<String> Keys = map.keySet();
        for(String k : Keys){
            System.out.println(k + " " + map.get(k));
        }

        // to remove

        map.remove("B");
        System.out.println(map);
    }
}
