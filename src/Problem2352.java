import java.util.ArrayList;
import java.util.List;

public class Problem2352 {
    public static int equalPairs(int[][] grid) {


        int[] column_start_with = grid[0];
        List<List<Integer>> column = new ArrayList<>();
        for (int i = 0; i < column_start_with.length; i++) {
            column.add(new ArrayList<>());
        }

        // iterate each row through grid

        for (int[] row : grid) {

            // iterate every row element of row
            for (int i = 0; i < row.length; i++) {
                column.get(i).add(row[i]);
            }
        }
        int cnt = 0;

        for(int row[] : grid){


            for(int i = 0;i<column_start_with.length;i++){
                if(row[0]  == column_start_with[i]){
                    if(isFalse(row , column.get(i))){

                        cnt++;
                    }
                }
            }
        }
        return  cnt;

    }

    private static boolean isFalse(int[] arr1, List<Integer> arr2) {
        if (arr1.length != arr2.size()) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        int result =equalPairs(grid);
        System.out.println("Number of equal pairs: " + result);

    }
}
