package strings;

import static java.lang.Character.toUpperCase;

class StringUtils {

    String upCaseFirstLetterInWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            char[] characters = word.toCharArray();
            characters[0] = toUpperCase(characters[0]);
            result.append(new String(characters)).append(" ");
        }
        return result.toString().trim();
    }
}
