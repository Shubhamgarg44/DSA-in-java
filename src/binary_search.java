public class binary_search {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int x =7;
        int r = arr.length-1;
        int l = 0;
        int m = (l + (r-1)) / 2;

        while (l <= r) {
            m = (l + (r-1)) / 2;

            if(arr[m] == x){
                System.out.println(m);
            }

            if(arr[m] < x){
                l = m+1;
            }

            else {
                r = m-1;
            }
        }
        }
    }
