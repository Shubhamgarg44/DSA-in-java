public class skip_string {
    public static void main(String[] args) {
        System.out.println(skip("bcaapple"));
    }
     static String skip(String s){
        if(s.isEmpty()) return "";

        if(s.startsWith("apple")){
            return (s.substring(5));
        } else {
            return s.charAt(0) + (skip(s.substring(1)));
        }
    }
}
