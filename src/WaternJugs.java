import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class WaternJugs {


    public static void printCombinations(int n) {
        List<Integer> current = new ArrayList<>();
        generateCombinations(n, 1, current);
    }

    public static void generateCombinations(int target, int start, List<Integer> current) {
        if (target == 0) {
            printList(current);
            return;
        }

        for (int i = start; i <= target; i++) {
            current.add(i);
            generateCombinations(target - i, i, current);
            current.remove(current.size() - 1);
        }
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        printCombinations(n);
    }
}
