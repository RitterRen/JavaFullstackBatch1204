package Question1;

import java.util.LinkedList;
import java.util.List;

public class CoolString {
    public static List<String> formMinCoolStrings(String s, int k){
        if (s == null || s.isEmpty()) return null;

        List<String> res = new LinkedList<>();
        char minChar = s.charAt(0);
        char maxChar = s.charAt(0);
        int left = 0;

        for (int i = 1; i < s.length(); i++) {
            if (minChar >= s.charAt(i)) {
                minChar = s.charAt(i);
            }
            if (maxChar <= s.charAt(i)) {
                maxChar = s.charAt(i);
            }
            if (maxChar - minChar > k) {
                res.add(s.substring(left, i));
                left = i;
                minChar = s.charAt(i);
                maxChar = s.charAt(i);
            }
        }

        res.add(s.substring(left));

        return res;
    }

    public static void main(String[] args) {
        String s = "zzzaazza";
        int k = 20;
        System.out.println(formMinCoolStrings(s, k));

        String s2 = "bcad";
        int k2 = 3;
        System.out.println(formMinCoolStrings(s2, k2));
    }
}
