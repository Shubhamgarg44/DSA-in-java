public class insertion_sort {
    public static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

// insertion sort
        //time complexity O(n^2)
        int[] arr = {7, 6, 1, 3, 9, 5, 2, 8, 4};
        for (int i = 1; i < arr.length; i++){
            int cur = arr[i];
            int j = i - 1;
            while(j>=0 && cur < arr[j]){
                arr[j+1] = arr[j];
                 j--;
            }
            arr[j+1] = cur;
        }
       printarray(arr);
    }

}