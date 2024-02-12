public class RepeatedSubStringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int j = 0, i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        int length = n - lps[n - 1];
        return n % length == 0 && lps[n - 1] > 0;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.repeatedSubstringPattern("abab"));  // Output: true
        System.out.println(solution.repeatedSubstringPattern("abcabcabc"));  // Output: true
        System.out.println(solution.repeatedSubstringPattern("aabaaba"));  // Output: false
    }
}
