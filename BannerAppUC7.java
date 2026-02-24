/**
 * Banner App UC7 - Store Character Pattern using Inner Static Class
 */
public class BannerAppUC7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character
         * @param pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to print banner
     */
    public static void printBanner(CharacterPatternMap[] patterns) {
        StringBuilder sb;

        for (int i = 0; i < 7; i++) {
            sb = new StringBuilder();

            for (CharacterPatternMap cp : patterns) {
                sb.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] P = {
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Create objects
        CharacterPatternMap o1 = new CharacterPatternMap('O', O);
        CharacterPatternMap o2 = new CharacterPatternMap('O', O);
        CharacterPatternMap p = new CharacterPatternMap('P', P);
        CharacterPatternMap s = new CharacterPatternMap('S', S);

        // Array of objects
        CharacterPatternMap[] banner = {o1, o2, p, s};

        // Print
        printBanner(banner);
    }
}