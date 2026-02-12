public class reverseString {

    public static String reverse(String input) {
        
        char[] arr = input.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        // Swap characters
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }

}
