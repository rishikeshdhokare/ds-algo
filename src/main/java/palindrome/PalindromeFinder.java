package palindrome;

import java.util.HashSet;
import java.util.Set;

class PalindromeFinder {

    boolean isPalindrome(String string) {
        int n = string.length();
        for (int i = 0; i < n / 2; ++i) {
            if (string.charAt(i) != string.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    Set<String> findAllPalindromes(String string) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String subString = string.substring(i, j);
                if (isPalindrome(subString)) {
                    palindromes.add(subString);
                }
            }
        }
        return palindromes;
    }
}
