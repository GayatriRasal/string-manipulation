import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String str1, String str2) {
        
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, not anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        System.out.println(isAnagram(s1, s2));  // true
    }
}
