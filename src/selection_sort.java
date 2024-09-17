public class selection_sort {
    public static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    // selection sort
    // time complexity = O(n^2)
    public static void main(String[] args) {
        int [] arr = {7,6,1,3,9,5,2,8,4};
        for (int i = 0; i<arr.length-1; i++){
            int min = i;
            for (int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        printarray(arr);
    }
}
