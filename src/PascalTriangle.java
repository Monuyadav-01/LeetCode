import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        if (rowIndex < 0)
            return row;

        long num = 1;
        for (int k = 0; k <= rowIndex; k++) {
            row.add((int) num);
            num = num * (rowIndex - k) / (k + 1);
        }

        return row;
    }

    public static void main(String[] args) {

        int rowIndex = 30;
        List<Integer> list = getRow(rowIndex);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
//[1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,-131213633,-123012780,-101304642,-73164463,-46209134,-25415023,-12102391,-4950978,-1722079,-502273,-120545,-23181,-3434,-367,-25,0]