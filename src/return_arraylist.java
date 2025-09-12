import java.util.ArrayList;

public class return_arraylist {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,4,5,6};
//        ArrayList<Integer> ans = find2(arr,4,0,new ArrayList<>());
        System.out.println(find2(arr,4,0));
    }
    static ArrayList<Integer> find(int []arr, int target,  int index, ArrayList<Integer>list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return find(arr, target, index+1, list);
    }

      // making array list inside the method instead of main method

    static ArrayList<Integer> find2(int []arr, int target,  int index){
        ArrayList<Integer> ans = new ArrayList<>();
        if(index == arr.length){
            return ans;
        }

        // it will contain and for that function call only
        if(arr[index] == target){
            ans.add(index);
        }
      ArrayList<Integer> ans2 = find2(arr, target, index+1);
        ans.addAll(ans2);
        return ans;
    }
}
