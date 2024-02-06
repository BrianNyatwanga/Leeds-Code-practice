/*You are given two strings word1 and word2. 
Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.*/

//Program code:
public class MergeAlternately {
    public static String mergeAlternately(String word1, String word2) {
        
        //Testing Range
        if (word1.length() < 1 || word1.length() > 100 || word2.length() < 1 || word2.length() > 100 ){
            return "Invalid input: word length out of range";
        }

        //Testing if LowerCase
        if (!word1.matches("[a-z]+") || !word2.matches("[a-z]+")){
            return "Invalid input: word contains non-lowercase letters";
        }
        //Appending characters        
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()){
            merged.append(word1.charAt(i)).append(word2.charAt(j));
            i++;
            j++;
        }
        merged.append(word1.substring(i)).append(word2.substring(j));
        return merged.toString();       
    }

    public static void main(String[] args) {
        String word1 = "home";
        String word2 = "towner";
        System.out.println(mergeAlternately(word1, word2));
    }
}
