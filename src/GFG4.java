import java.util.HashMap;

public class GFG4 {
    static int singleElement(int[] arr , int N) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans  = 0;

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i) == 1){
                ans = i;
            }
        }
        return  ans;


    }
    public static void main(String[] args) {
        int arr [] = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1};
        int N= arr.length;
        System.out.println(singleElement(arr,N));
    }
}
