import java.util.*;

public class linked_list_collection_framework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.addFirst("hello");
        System.out.println(list);
        System.out.println(list.size());
        list.removeFirst();
        list.remove(2);
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

    }
}
