public class subset {
    public static void main(String[] args) {
         subset1("","abc");
    }

    static void subset1(String p , String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset1(p + ch, up.substring(1));
        subset1(p, up.substring(1));
    }
}
