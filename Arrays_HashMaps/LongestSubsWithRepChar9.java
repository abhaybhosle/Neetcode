import java.util.*;

public class LongestSubsWithRepChar9 {

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;                    // Left pointer representing the start of the current substring
        int maxLength = 0;               // Length of the longest substring without repeating characters
        int n = s.length();              // Length of the input string

        Set<Character> set = new HashSet<>();  // Set to keep track of unique characters in the current substring

        // Iterate through the string using the right pointer
        for (int right = 0; right < n; right++) {
            // If the current character is not in the set, we have a new unique character
            if (!set.contains(s.charAt(right))) {
                // Add the character to the set and update maxLength if necessary
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                // If the character is already present, indicating a repeating character
                // Move the left pointer forward, removing characters from the set until the repeating character is no longer present
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                // Add the current character to the set
                set.add(s.charAt(right));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
