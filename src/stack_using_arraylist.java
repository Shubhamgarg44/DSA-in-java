import java.util.ArrayList;

public class stack_using_arraylist {
    class stack {
       static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int x) {
            list.add(x);
        }

        public static int pop() {
           int top = list.get(list.size()-1);
           list.remove(list.size()-1);
           return top;
}

public static int peek() {
            return list.get(list.size()-1);
}
    }
    public static void main(String[] args) {

    }
}
