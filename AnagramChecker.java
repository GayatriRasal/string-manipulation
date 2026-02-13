import java.util.Arrays;

public class AnagramChecker {

    public boolean isAnagram(String str1, String str2) {

        // Null check
        if (str1 == null || str2 == null) {
            return false;
        }
        String st1,st2;
        // Remove all whitespace and convert to lowercase
        st1 = str1.replaceAll("\\s+", "").toLowerCase();
        st2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Length check
        if (st1.length() != st2.length()) {
            return false;
        }

        // If both are empty after cleaning
        if (st1.length() == 0) {
            return true;
        }

        // Convert to char arrays
        char[] arr1 = st1.toCharArray();
        char[] arr2 = st2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare
        boolean res= Arrays.equals(arr1, arr2);
        System.out.println("Checking: " + str1 + " & " + str2 + " -> " + res);
        return res;
    }
    
}
