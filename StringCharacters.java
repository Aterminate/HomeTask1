public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        int spaces = 0;
        int vowels = 0;
        int letters = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isWhitespace(c)) {
                spaces++;
            } else if (Character.isLetter(c)) {
                letters++;
                if ("aeiou".contains(String.valueOf(c))) {
                    vowels++;
                }
            }
        }

        int consonants = letters - vowels;

        System.out.println("The text contained vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
    }
}
