import java.util.Arrays;

public class ValidAnagram2 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "ilestn";
        System.out.println(isAnagram(s, t));
    }
}
