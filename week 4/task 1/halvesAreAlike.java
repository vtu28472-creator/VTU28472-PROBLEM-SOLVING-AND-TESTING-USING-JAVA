public class Main {

    public static boolean halvesAreAlike(String s) {

        int middle = s.length() / 2;

        int firstCount = 0;
        int secondCount = 0;

        // First half
        for (int i = 0; i < middle; i++) {
            if (isVowel(s.charAt(i))) {
                firstCount++;
            }
        }

        // Second half
        for (int i = middle; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                secondCount++;
            }
        }

        return firstCount == secondCount;
    }

    // Check whether a character is a vowel
    public static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        String s = "book";

        boolean result = halvesAreAlike(s);

        System.out.println(result);
    }
}