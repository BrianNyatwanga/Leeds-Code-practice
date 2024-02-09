import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Create a map to store the frequency of each character in s
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Update the frequency of each character in t
        for (char c : t.toCharArray()) {
            if (charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) - 1);
                if (charFreq.get(c) == 0) {
                    charFreq.remove(c);
                }
            } else {
                return false;  // t contains a character not in s
            }
        }

        // Check if all character frequencies are 0
        return charFreq.isEmpty();
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s, t));  // Output: true
    }
}
