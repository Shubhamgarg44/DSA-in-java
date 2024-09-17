public class bubble_sort {

    // print array
    public static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
  int [] arr = {7,6,1,3,9,5,2,8,4};

  // bubble sort
        // time complexity = O(n^2)
  for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
          if (arr[j] > arr[j+1]) {
             int temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
          }
      }
  }
  printarray(arr);
    }
}
