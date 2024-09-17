import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        // creation
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        //  search - contain
        if (set.contains(6)) {
            System.out.println(set);
        } else {
            System.out.println("not paass");
        }

        // delete
        set.remove(2);
        if (set.contains(2)) {
            System.out.println("faslse");
        }else {
            System.out.println(set);
        }

        System.out.println(set.size());

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        }
    }