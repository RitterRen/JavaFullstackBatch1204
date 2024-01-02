package Question1;

public class ShiftCharactersInGivenString {
    public String shiftCharacters(String s, int k){
        int startIndex = k >= 0 ? s.length() - 1 : 0;
        while (k > 1) {
            if (startIndex == 0) startIndex = s.length() - 1;
            else startIndex -= 1;
            k--;
        }
        while (k < 0) {
             if (startIndex == s.length() - 1) startIndex = 0;
             else startIndex++;
             k++;
        }

        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            if (startIndex == s.length()) startIndex = 0;
            sb.append(s.charAt(startIndex));
            startIndex++;
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        int k1 = 1;
        String s2 = "abc";
        int k2 = -1;
        ShiftCharactersInGivenString solution = new ShiftCharactersInGivenString();
        System.out.println(solution.shiftCharacters(s1, k1));
        System.out.println(solution.shiftCharacters(s2, k2));
    }
}
