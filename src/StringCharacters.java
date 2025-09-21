public class StringCharacters {
    public static void main(String[] args) {

        String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer" + " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles," + " and by opposing end them?";
        int spaces = 0,
                vowels = 0,
                letters = 0;
        //YOUR CODE HERE

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                letters++;
            }
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'o' || lower == 'u' || lower == 'i') {
                vowels++;
            } else if (ch == ' ') {
                spaces++;
            }
        }
        System.out.println("The text contained vowels: " + vowels + "\n in consonants \n" + (letters - vowels) + " spaces: " + spaces);
    }
}