public class skip_char {
    public static void main(String[] args) {
        System.out.println( skip2("abbabhydsgabb"));
    }

    //   with extra string
   static void skip(String s, String up){
        if(up.isEmpty() ){
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(s,up.substring(1));
        } else{
            skip(s + ch, up.substring(1));
        }
    }


    // no extra string
    static String skip2(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            return skip2(s.substring(1));
        }else{
            return ch + skip2(s.substring(1));
        }
    }
}
