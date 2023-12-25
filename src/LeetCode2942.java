import java.util.ArrayList;
import java.util.List;

public class LeetCode2942 {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                if (c == x) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';
        List<Integer> list = findWordsContaining(words, x);
        list.stream().forEach(System.out::println);
    }
}
