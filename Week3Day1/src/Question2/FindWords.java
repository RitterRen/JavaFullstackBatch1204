package Question2;

import java.util.ArrayList;
import java.util.List;

public class FindWords {
    public static List<Integer> getIndexes(String sentence, String prefix) {
        // start your code here
        List<Integer> res = new ArrayList<>();
        int left = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') continue;

            if (left <= i && startWithPrefix(sentence, prefix, left, i)) {
                res.add(left);
            }

            left = i + 1;
        }

        if (left < sentence.length() && startWithPrefix(sentence, prefix, left, sentence.length())) {
            res.add(left);
        }

        return res;
    }

    private static boolean startWithPrefix(String sentence, String prefix, int left, int right) {
        if (right - left < prefix.length()) return false;

        for (int i = 0; i < prefix.length(); i++) {
            if (sentence.charAt(i + left) != prefix.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String testcase1 = "a aa Aaa abca bca";
        String prefix1 = "a";
        String prefix2 = "bc";

        System.out.println(getIndexes(testcase1, prefix1));
        System.out.println(getIndexes(testcase1, prefix2));
    }
}
