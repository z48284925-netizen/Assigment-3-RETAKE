import java.util.Arrays;

public class Task1_AnagramSortChecker {

    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        System.out.println(areAnagrams(first, second) ? "YES" : "NO");
    }
}
