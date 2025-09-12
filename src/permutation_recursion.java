public class permutation_recursion {
    public static void main(String[] args) {
        permutationRecursion("","abc");
    }

    static void permutationRecursion(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
               return;
        }
        char ch = up.charAt(0);
        for(int i =0; i<=p.length(); i++){
            String sub = p.substring(0,i);
            String subUp = p.substring(i,p.length());
            permutationRecursion(sub + ch + subUp,up.substring(1));
        }
    }
}
