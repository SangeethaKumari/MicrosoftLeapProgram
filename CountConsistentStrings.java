//Leetcode 1684. Count the Number of Consistent Strings
class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedCharacter = new HashSet<Character>();

        for (char c : allowed.toCharArray()) {
            allowedCharacter.add(c);
        }

        int isConsistentWords = 0;
        for (String word : words) {
            if (isConsistent(word, allowedCharacter)) {
                isConsistentWords++;
            }
        }
        return isConsistentWords;
    }

    public boolean isConsistent(String word, final Set<Character> allowedWords) {
        for (char c : word.toCharArray()) {  
            if (!allowedWords.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
